package lk.sliit.mtit.ecommerce.cart.service.serviceimpl;

import lk.sliit.mtit.ecommerce.cart.dao.ItemDAO;
import lk.sliit.mtit.ecommerce.cart.dto.ItemDTO;
import lk.sliit.mtit.ecommerce.cart.entity.Item;
import lk.sliit.mtit.ecommerce.cart.service.ItemBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
@Slf4j // login handling
public class ItemBOImpl implements ItemBO {
    @Autowired
    private ItemDAO itemDAO;

    @Override
    public ItemDTO saveItem(ItemDTO itemDTO) {
        itemDAO.save(new Item(
                itemDTO.getItemId(),
                itemDTO.getItemName(),
                itemDTO.getItemPrice(),
                itemDTO.getItemQty(),
                itemDTO.getDate(),
                itemDTO.getSellerId()
        ));
        log.info("Save Item");
        return itemDTO;
    }

    @Override
    public ItemDTO getItem(Long itemId) {
        Item item = itemDAO.getByItemId(itemId);
        return new ItemDTO(
                item.getItemId(),
                item.getItemName(),
                item.getItemPrice(),
                item.getItemQty(),
                item.getDate(),
                item.getSellerId()
        );
    }

    @Override
    public void deleteItem(Long itemId) {
        try{
            itemDAO.deleteItemByItemId(itemId);
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        itemDAO.save(new Item(
                itemDTO.getItemId(),
                itemDTO.getItemName(),
                itemDTO.getItemPrice(),
                itemDTO.getItemQty(),
                itemDTO.getDate(),
                itemDTO.getSellerId()
        ));
        log.info("Updated BO");
    }

    @Transactional(readOnly = true)
    @Override
    public List<ItemDTO> getAllItem() {
        List<Item> items = itemDAO.findAll();
        List<ItemDTO> itemDTOList = new ArrayList<>();
        for (Item item: items
             ) {
            itemDTOList.add(new ItemDTO(
                    item.getItemId(),
                    item.getItemName(),
                    item.getItemPrice(),
                    item.getItemQty(),
                    item.getDate(),
                    item.getSellerId()
            ));
        }
        return itemDTOList;
    }
}