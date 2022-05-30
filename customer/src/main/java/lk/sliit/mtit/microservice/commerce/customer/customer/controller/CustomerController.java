package lk.sliit.mtit.microservice.commerce.customer.customer.controller;

import lk.sliit.mtit.microservice.commerce.customer.customer.entity.Customer;
import lk.sliit.mtit.microservice.commerce.customer.customer.service.CustomerBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerBO customerBO;

    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        log.info("Inside Controller Save");
        return customerBO.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") Long customerId) {
        log.info("Inside Controller Get");
        return customerBO.findCustomer(customerId);
    }
}
