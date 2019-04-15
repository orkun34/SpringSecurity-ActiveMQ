package com.lombardi.security.activemq.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author orkun
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.lombardi.security.activemq")
public class App{

    @Autowired
    JmsTemplate jmsTemplate;

    public static void main(String[] args) {

        SpringApplication.run(App.class,args);
        // Launch the application
        /*ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

        // Send a message with a POJO - the template reuse the message converter
        System.out.println("Sending an email message.");
        jmsTemplate.convertAndSend("mailbox", new Email("info@example.com", "Hello"));*/
    }


}
