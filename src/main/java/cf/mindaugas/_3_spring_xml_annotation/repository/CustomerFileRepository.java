package cf.mindaugas._3_spring_xml_annotation.repository;

import cf.mindaugas._3_spring_xml_annotation.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("custFileRepo")
public class CustomerFileRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        var customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Mindaugas"));
        customers.add(new Customer(2, "John"));
        return customers;
    }
}
