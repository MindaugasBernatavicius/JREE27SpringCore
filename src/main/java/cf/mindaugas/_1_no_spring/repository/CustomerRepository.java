package cf.mindaugas._1_no_spring.repository;

import cf.mindaugas._1_no_spring.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}
