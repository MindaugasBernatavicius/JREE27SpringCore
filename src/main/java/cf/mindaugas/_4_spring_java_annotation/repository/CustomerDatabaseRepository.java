package cf.mindaugas._4_spring_java_annotation.repository;

import cf.mindaugas._4_spring_java_annotation.entity.Customer;

import java.util.List;

// @Repository("custDbRepo")
public class CustomerDatabaseRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        return null;
    }
}
