package cf.mindaugas._4_spring_java_annotation;


import cf.mindaugas._4_spring_java_annotation.repository.CustomerFileRepository;
import cf.mindaugas._4_spring_java_annotation.repository.CustomerRepository;
import cf.mindaugas._4_spring_java_annotation.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan({"cf.mindaugas._4_spring_java_annotation"})
class AppConfig {
    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        // return new CustomerFileRepository();
        return new CustomerFileRepository();
    }

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        return new CustomerService();
    }
}

public class App {
    public static void main(String[] args) {
        // manually injecting the CustomerFileRepository to CustomerService
        // CustomerService cs = new CustomerService(new CustomerFileRepository()); // works!

        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        var customerService = appContext.getBean("customerService", CustomerService.class);

        System.out.println("Total number of customers: " + customerService.getCount());
    }
}
