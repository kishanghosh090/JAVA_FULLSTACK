package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext myApp = SpringApplication.run(SpringDemoApplication.class, args);
	    for (String beanName: myApp.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

        MessageService msgService = myApp.getBean(MessageService.class);

        System.out.println(msgService.getMessage());
    }

}
