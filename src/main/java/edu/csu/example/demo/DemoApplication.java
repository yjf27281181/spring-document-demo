package edu.csu.example.demo;

import edu.csu.example.demo.service.PetStoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);

// use configured instance
        List<String> userList = service.getUsernameList();

        System.out.println(userList);
    }

}
