package lk.sliit.mtit.ecommerce.item.controller;

import lk.sliit.mtit.ecommerce.item.dto.ItemDTO;
import lk.sliit.mtit.ecommerce.item.entity.Item;
import lk.sliit.mtit.ecommerce.item.service.ItemBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemBO itemBO;

    @PostMapping("/saveItem")
    public ItemDTO saveItem(@RequestBody ItemDTO itemDTO){
        return itemBO.saveItem(itemDTO);
    }

    @GetMapping("/{itemId}")
    public ItemDTO getItems(@PathVariable("itemId") Long itemId){
        return itemBO.getItem(itemId);
    }

    @DeleteMapping("/{itemId}")
    public void deleteItem(@PathVariable("itemId") Long itemId){
        itemBO.deleteItem(itemId);
    }

    @PutMapping("/{itemId}")
    public void updateItem(@PathVariable Long itemId,
                           @RequestBody ItemDTO itemDTO){
        itemDTO.setItemId(itemId);
        itemBO.updateItem(itemDTO);
    }

    @GetMapping("/getAll")
    public List<ItemDTO> getAllItems(){
        return itemBO.getAllItem();
    }
}
