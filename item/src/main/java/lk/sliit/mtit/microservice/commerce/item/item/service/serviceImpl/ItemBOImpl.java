package lk.sliit.mtit.microservice.commerce.item.item.service.serviceImpl;

import lk.sliit.mtit.microservice.commerce.item.item.entity.Items;
import lk.sliit.mtit.microservice.commerce.item.item.repository.ItemDAO;
import lk.sliit.mtit.microservice.commerce.item.item.service.ItemBO;
import lk.sliit.mtit.microservice.commerce.item.item.valueobjects.ResponseTemplateVO;
import lk.sliit.mtit.microservice.commerce.item.item.valueobjects.Seller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ItemBOImpl implements ItemBO {

    @Autowired
    private ItemDAO itemDAO;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Items saveItems(Items items) {
        return itemDAO.save(items);
    }

    @Override
    public ResponseTemplateVO getItemWithSeller(Long itemId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Items items = itemDAO.getByItemId(itemId);
        Seller seller = restTemplate.getForObject("http://SELLER-SERVICE/sellers/"+items.getSellerId(),Seller.class);
        responseTemplateVO.setItems(items);
        responseTemplateVO.setSeller(seller);

        return responseTemplateVO;
    }
}
