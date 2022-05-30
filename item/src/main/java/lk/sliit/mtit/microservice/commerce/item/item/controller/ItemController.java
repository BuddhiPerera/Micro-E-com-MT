package lk.sliit.mtit.microservice.commerce.item.item.controller;

import lk.sliit.mtit.microservice.commerce.item.item.entity.Items;
import lk.sliit.mtit.microservice.commerce.item.item.service.ItemBO;
import lk.sliit.mtit.microservice.commerce.item.item.valueobjects.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/items")
@Slf4j
public class ItemController {

    @Autowired
    private ItemBO itemBO;


    @PostMapping("/saveItem")
    public Items saveItems(@RequestBody Items items){
        log.info("Save Item Controller");
        return itemBO.saveItems(items);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getItemWithSeller(@PathVariable("id") Long itemId){
        return itemBO.getItemWithSeller(itemId);
    }
}
