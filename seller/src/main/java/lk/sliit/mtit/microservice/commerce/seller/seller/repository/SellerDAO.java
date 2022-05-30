package lk.sliit.mtit.microservice.commerce.seller.seller.repository;

import lk.sliit.mtit.microservice.commerce.seller.seller.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerDAO extends JpaRepository<Seller,Long> {
    Seller getBySellerId(Long sellerId);
}
