package cf.mindaugas._3_spring_xml_annotation.service;

import cf.mindaugas._3_spring_xml_annotation.repository.CustomerDatabaseRepository;
import cf.mindaugas._3_spring_xml_annotation.repository.CustomerFileRepository;
import cf.mindaugas._3_spring_xml_annotation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    // private CustomerFileRepository customerFileRepository;
    // private CustomerDatabaseRepository customerDatabaseRepository;

    // public CustomerService() {
    // }

    // ... if you wanted to use both repost at runtime, you would
    // ... simply inject them both, no need to choose if you do not
    // ... use the dependency inversion (you do not specify the interface when wiring).
    // @Autowired
    // public CustomerService(
    //         CustomerFileRepository customerFileRepository,
    //         CustomerDatabaseRepository customerDatabaseRepository
    // ) {
    //     this.customerFileRepository = customerFileRepository;
    //     this.customerDatabaseRepository = customerDatabaseRepository;
    // }

    // public int getCount(){
    //     var cfrCount = this.customerFileRepository.findAll() != null
    //             ? this.customerFileRepository.findAll().size()
    //             : 0;
    //     var cdrCount = this.customerDatabaseRepository.findAll() != null
    //             ? this.customerDatabaseRepository.findAll().size()
    //             : 0;
    //     return cfrCount + cdrCount;
    // }

    @Autowired // property/field autowiring
    private CustomerRepository customerRepository;

    public CustomerService() {
    }

    // 1. Dependency Injection - Constructor Injection
    // @Autowired // constructor autowiring
    // public CustomerService(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    // 2. Dependency Injection - Setter Injection
    // @Autowired // setter autowiring
    // public void setCustomerRepository(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    public int getCount(){
        return this.customerRepository.findAll() != null
                ? this.customerRepository.findAll().size()
                : 0;
    }
}
