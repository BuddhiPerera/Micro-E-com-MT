package lk.sliit.mtit.ecommerce.order.dao;

import lk.sliit.mtit.ecommerce.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {
    Order getByOrderId(Long orderId);

    void deleteItemByOrderId(Long orderId);
}
