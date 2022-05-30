package lk.sliit.mtit.microservice.commerce.customer.customer.service;

import lk.sliit.mtit.microservice.commerce.customer.customer.entity.Customer;

public interface CustomerBO {
    Customer saveCustomer(Customer customer);

    Customer findCustomer(Long customerId);
}
