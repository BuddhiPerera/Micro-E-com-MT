package lk.sliit.mtit.ecommerce.cart.controller;

import lk.sliit.mtit.ecommerce.cart.dto.CartDTO;
import lk.sliit.mtit.ecommerce.cart.service.CartBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartBO cartBO;

    @PostMapping("/saveCart")
    public CartDTO saveCart(@RequestBody CartDTO cartDTO){
        return cartBO.saveCart(cartDTO);
    }

    @GetMapping("/{cartId}")
    public CartDTO getCart(@PathVariable("cartId") Long cartId){
        return cartBO.getCart(cartId);
    }

    @DeleteMapping("/{cartId}")
    public void deleteCart(@PathVariable("cartId") Long cartId){
        cartBO.deleteCart(cartId);
    }

    @PutMapping("/{cartId}")
    public void updateCart(@PathVariable Long cartId,
                           @RequestBody CartDTO cartDTO){
        cartDTO.setCartId(cartId);
        cartBO.updateCart(cartDTO);
    }

    @GetMapping("/getAll")
    public List<CartDTO> getAllItems(){
        return cartBO.getAllItem();
    }
}
