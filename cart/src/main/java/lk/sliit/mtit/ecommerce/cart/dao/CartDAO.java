package lk.sliit.mtit.ecommerce.cart.dao;

import lk.sliit.mtit.ecommerce.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDAO extends JpaRepository<Cart, Long> {
    Cart getByCartId(Long cartId);

    void deleteCartByCartId(Long cartId);
}
