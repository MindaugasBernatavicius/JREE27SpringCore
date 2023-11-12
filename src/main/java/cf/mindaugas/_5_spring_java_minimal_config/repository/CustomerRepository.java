package cf.mindaugas._5_spring_java_minimal_config.repository;

import cf.mindaugas._5_spring_java_minimal_config.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}
