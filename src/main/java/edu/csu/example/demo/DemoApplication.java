package edu.csu.example.demo;

import edu.csu.example.demo.service.PetStoreService;
import edu.csu.example.demo.test.ExampleBean;
import edu.csu.example.demo.test.ExampleBean2;
import edu.csu.example.demo.test.MyTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml", "things.xml");

        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);

    // use configured instance
        List<String> userList = service.getUsernameList();
        System.out.println(userList);

        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println(exampleBean.toString());

        ExampleBean2 exampleBean2 = context.getBean("exampleBean2", ExampleBean2.class);
        System.out.println(exampleBean2.toString());

        MyTest myTest = context.getBean("mytest", MyTest.class);
        System.out.println(myTest.toString());

    }

}
