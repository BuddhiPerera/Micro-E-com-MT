package lk.sliit.mtit.microservice.commerce.customer.customer.repository;

import lk.sliit.mtit.microservice.commerce.customer.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {
    Customer findByCustomerId(Long customerId);
}
