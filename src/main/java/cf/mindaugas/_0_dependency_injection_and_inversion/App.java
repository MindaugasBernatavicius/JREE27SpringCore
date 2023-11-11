package cf.mindaugas._0_dependency_injection_and_inversion;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // CustomerService cs = new CustomerService(new CustomerDatabaseRepository()); // works!
        CustomerService cs = new CustomerService(new CustomerFileRepository()); // works!

        System.out.println("Total number of customers: " + cs.getCount());
    }
}

interface CustomerRepository {
    public List<String> findAll();
}

class CustomerDatabaseRepository implements CustomerRepository {
    public List<String> findAll() {
        // complex logic to get data from DB
        return null;
    }
}

class CustomerFileRepository implements CustomerRepository {
    public List<String> findAll() {
        // complex logic to get data from some Files
        return null;
    }
}

class CustomerService {

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