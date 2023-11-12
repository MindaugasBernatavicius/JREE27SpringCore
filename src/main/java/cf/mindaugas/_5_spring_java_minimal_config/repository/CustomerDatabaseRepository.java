package cf.mindaugas._5_spring_java_minimal_config.repository;

import cf.mindaugas._5_spring_java_minimal_config.entity.Customer;

import java.util.List;

// @Repository("custDbRepo")
public class CustomerDatabaseRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        return null;
    }
}
