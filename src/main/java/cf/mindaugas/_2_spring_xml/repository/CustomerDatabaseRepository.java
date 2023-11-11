package cf.mindaugas._2_spring_xml.repository;

import cf.mindaugas._2_spring_xml.entity.Customer;

import java.util.List;

public class CustomerDatabaseRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        return null;
    }
}
