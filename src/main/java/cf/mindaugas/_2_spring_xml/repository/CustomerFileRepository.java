package cf.mindaugas._2_spring_xml.repository;

import cf.mindaugas._2_spring_xml.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerFileRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        var customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Mindaugas"));
        customers.add(new Customer(2, "John"));
        return customers;
    }
}
