package cf.mindaugas._2_spring_xml.service;

import cf.mindaugas._2_spring_xml.repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService() {
    }

    // 1. Dependency Injection - Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // 2. Dependency Injection - Setter Injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public int getCount(){
        return this.customerRepository.findAll() != null
                ? this.customerRepository.findAll().size()
                : 0;
    }
}
