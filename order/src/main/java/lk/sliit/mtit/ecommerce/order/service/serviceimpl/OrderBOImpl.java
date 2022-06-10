package lk.sliit.mtit.ecommerce.order.service.serviceimpl;

import lk.sliit.mtit.ecommerce.order.dao.OrderDAO;
import lk.sliit.mtit.ecommerce.order.dto.OrderDTO;
import lk.sliit.mtit.ecommerce.order.entity.Order;
import lk.sliit.mtit.ecommerce.order.service.OrderBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
@Slf4j
public class OrderBOImpl implements OrderBO {
    @Autowired
    private OrderDAO orderDAO;

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        orderDAO.save(new Order(
                orderDTO.getOrderId(),
                orderDTO.getOrderName(),
                orderDTO.getOrderAddress(),
                orderDTO.getOrderState(),
                orderDTO.getOrderCountry(),
                orderDTO.getZipCode(),
                orderDTO.getContactNo(),
                orderDTO.getOrderQty(),
                orderDTO.getOrderDate()
        ));
        log.info("Save Order");
        return orderDTO;
    }

    @Override
    public OrderDTO getOrder(Long orderId) {
        Order order = orderDAO.getByOrderId(orderId);
        return new OrderDTO(
                order.getOrderId(),
                order.getOrderName(),
                order.getOrderAddress(),
                order.getOrderState(),
                order.getOrderCountry(),
                order.getZipCode(),
                order.getContactNo(),
                order.getOrderQty(),
                order.getOrderDate()
        );
    }

    @Override
    public void deleteOrder(Long orderId) {
        try{
            orderDAO.deleteItemByOrderId(orderId);
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

    @Override
    public void updateOrder(OrderDTO orderDTO) {
        orderDAO.save(new Order(
                orderDTO.getOrderId(),
                orderDTO.getOrderName(),
                orderDTO.getOrderAddress(),
                orderDTO.getOrderState(),
                orderDTO.getOrderCountry(),
                orderDTO.getZipCode(),
                orderDTO.getContactNo(),
                orderDTO.getOrderQty(),
                orderDTO.getOrderDate()
        ));
        log.info("Updated Order");
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderDAO.findAll();
        List<OrderDTO> orderDTOS = new ArrayList<>();
        for (Order order: orders
             ) {
            orderDTOS.add(new OrderDTO(
                    order.getOrderId(),
                    order.getOrderName(),
                    order.getOrderAddress(),
                    order.getOrderState(),
                    order.getOrderCountry(),
                    order.getZipCode(),
                    order.getContactNo(),
                    order.getOrderQty(),
                    order.getOrderDate()
            ));
        }
        return orderDTOS;
    }
}