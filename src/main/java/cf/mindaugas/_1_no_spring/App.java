package cf.mindaugas._1_no_spring;


import cf.mindaugas._1_no_spring.repository.CustomerFileRepository;
import cf.mindaugas._1_no_spring.service.CustomerService;

public class App {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService(new CustomerFileRepository()); // works!

        System.out.println("Total number of customers: " + cs.getCount());
    }
}
