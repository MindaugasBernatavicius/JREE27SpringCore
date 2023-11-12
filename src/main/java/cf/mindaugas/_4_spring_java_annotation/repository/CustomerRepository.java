package cf.mindaugas._4_spring_java_annotation.repository;

import cf.mindaugas._4_spring_java_annotation.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}
