package cf.mindaugas._3_spring_xml_annotation.repository;

import cf.mindaugas._3_spring_xml_annotation.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}
