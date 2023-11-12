package cf.mindaugas._5_spring_java_minimal_config;

import cf.mindaugas._5_spring_java_minimal_config.service.CustomerService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration
// @ComponentScan({"cf.mindaugas._5_spring_java_minimal_config"})
// class AppConfig {}

class SpringApplication {
    public static ConfigurableApplicationContext run(Class clazz, String[] args){
        return new AnnotationConfigApplicationContext(clazz);
    }
}

@Configuration
@ComponentScan({"cf.mindaugas._5_spring_java_minimal_config"})
public class App {
    public static void main(String[] args) {
        var appContext = SpringApplication.run(App.class, args);
        var customerService = appContext.getBean("customerService", CustomerService.class);

        System.out.println("Total number of customers: " + customerService.getCount());
    }
}
