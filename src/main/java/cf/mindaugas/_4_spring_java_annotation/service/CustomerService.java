package cf.mindaugas._4_spring_java_annotation.service;

import cf.mindaugas._4_spring_java_annotation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service
public class CustomerService {
    @Autowired // property/field autowiring
    private CustomerRepository customerRepository;

    public CustomerService() {}

    // 1. Dependency Injection - Constructor Injection
    // @Autowired // constructor autowiring - will not work if beans are created in the @Config class
    // public CustomerService(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    // 2. Dependency Injection - Setter Injection
    // @Autowired // setter autowiring - will not work if beans are created in the @Config class
    // public void setCustomerRepository(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    public int getCount(){
        return this.customerRepository.findAll() != null
                ? this.customerRepository.findAll().size()
                : 0;
    }
}
