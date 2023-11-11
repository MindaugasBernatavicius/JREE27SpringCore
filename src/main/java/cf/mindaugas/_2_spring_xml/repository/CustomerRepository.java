package cf.mindaugas._2_spring_xml.repository;

import cf.mindaugas._2_spring_xml.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}
