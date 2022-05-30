package lk.sliit.mtit.microservice.commerce.item.item.service;

import lk.sliit.mtit.microservice.commerce.item.item.entity.Items;
import lk.sliit.mtit.microservice.commerce.item.item.valueobjects.ResponseTemplateVO;

public interface ItemBO {
    Items saveItems(Items items);

    ResponseTemplateVO getItemWithSeller(Long itemId);
}
