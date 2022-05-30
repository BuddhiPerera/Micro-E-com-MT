package lk.sliit.mtit.microservice.commerce.item.item.repository;

import lk.sliit.mtit.microservice.commerce.item.item.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDAO extends JpaRepository<Items, Long> {
    Items getByItemId(Long itemId);
}
