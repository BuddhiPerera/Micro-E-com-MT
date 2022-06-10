package lk.sliit.mtit.ecommerce.order.service;

import lk.sliit.mtit.ecommerce.order.dto.OrderDTO;

import java.util.List;

public interface OrderBO {
    OrderDTO saveOrder(OrderDTO orderDTO);

    OrderDTO getOrder(Long orderId);

    void deleteOrder(Long orderId);

    void updateOrder(OrderDTO orderDTO);

    List<OrderDTO> getAllOrders();
}
