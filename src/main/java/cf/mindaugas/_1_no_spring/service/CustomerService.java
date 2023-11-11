package cf.mindaugas._1_no_spring.service;

import cf.mindaugas._1_no_spring.repository.CustomerRepository;

public class CustomerService {

    // // 0. No dependency injection
    // private CustomerRepository cr = new CustomerRepository();
    //
    // public CustomerService() {
    //     // 0. No dependency injection
    //     this.cr = new CustomerRepository();
    // }

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
