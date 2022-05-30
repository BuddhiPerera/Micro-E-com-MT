package lk.sliit.mtit.microservice.commerce.customer.customer.service.serviceimpl;

import lk.sliit.mtit.microservice.commerce.customer.customer.entity.Customer;
import lk.sliit.mtit.microservice.commerce.customer.customer.repository.CustomerDAO;
import lk.sliit.mtit.microservice.commerce.customer.customer.service.CustomerBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBOImpl implements CustomerBO {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public Customer findCustomer(Long customerId) {
        return customerDAO.findByCustomerId(customerId);
    }
}
