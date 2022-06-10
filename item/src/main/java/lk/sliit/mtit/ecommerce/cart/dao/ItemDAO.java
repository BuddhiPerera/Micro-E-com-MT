package lk.sliit.mtit.ecommerce.cart.dao;

import lk.sliit.mtit.ecommerce.cart.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDAO extends JpaRepository<Item, Long> {
    Item getByItemId(Long itemId);

    void deleteItemByItemId(Long itemId);

}
