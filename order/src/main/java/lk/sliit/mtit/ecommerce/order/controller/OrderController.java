package lk.sliit.mtit.ecommerce.order.controller;

import lk.sliit.mtit.ecommerce.order.dto.OrderDTO;
import lk.sliit.mtit.ecommerce.order.service.OrderBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderBO orderBo;

    @PostMapping("/saveOrder")
    public OrderDTO saveOrder(@RequestBody OrderDTO orderDTO){
        return orderBo.saveOrder(orderDTO);
    }

    @GetMapping("/{orderId}")
    public OrderDTO getOrder(@PathVariable("orderId") Long orderId){
        return orderBo.getOrder(orderId);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long orderId){
        orderBo.deleteOrder(orderId);
    }

    @PutMapping("/{orderId}")
    public void updateOrder(@PathVariable Long orderId,
                           @RequestBody OrderDTO orderDTO){
        orderDTO.setOrderId(orderId);
        orderBo.updateOrder(orderDTO);
    }

    @GetMapping("/getAll")
    public List<OrderDTO> getAllOrders(){
        return orderBo.getAllOrders();
    }
}
