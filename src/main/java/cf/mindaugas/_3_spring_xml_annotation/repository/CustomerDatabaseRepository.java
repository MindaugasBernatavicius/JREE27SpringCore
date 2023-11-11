package cf.mindaugas._3_spring_xml_annotation.repository;

import cf.mindaugas._3_spring_xml_annotation.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository("custDbRepo")
public class CustomerDatabaseRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        return null;
    }
}
