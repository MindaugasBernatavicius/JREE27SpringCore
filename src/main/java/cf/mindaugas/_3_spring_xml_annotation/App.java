package cf.mindaugas._3_spring_xml_annotation;

import cf.mindaugas._3_spring_xml_annotation.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // manually injecting the CustomerFileRepository to CustomerService
        // CustomerService cs = new CustomerService(new CustomerFileRepository()); // works!

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml-annotations.xml");
        var customerService = (CustomerService)appCtx.getBean("customerService"); // new CustomerService()

        System.out.println("Total number of customers: " + customerService.getCount());
    }
}
