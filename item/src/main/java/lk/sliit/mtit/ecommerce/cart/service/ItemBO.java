package lk.sliit.mtit.ecommerce.cart.service;

import lk.sliit.mtit.ecommerce.cart.dto.ItemDTO;

import java.util.List;

public interface ItemBO {
    ItemDTO saveItem(ItemDTO itemDTO);

    ItemDTO getItem(Long itemId);

    void deleteItem(Long itemId);

    void updateItem(ItemDTO item);

    List<ItemDTO> getAllItem();
}
