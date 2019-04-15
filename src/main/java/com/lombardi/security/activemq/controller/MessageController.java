package com.lombardi.security.activemq.controller;

import com.lombardi.security.activemq.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.lombardi.security.activemq.config.JmsConfig.MAIL_TOPIC;
/**
 * @author orkun
 */

@RestController
public class MessageController {

    @Autowired
    JmsTemplate jmsTemplate;

    @PostMapping(produces = "application/json")
    public void sendMessage(@RequestBody String message){
        jmsTemplate.convertAndSend(MAIL_TOPIC,new Email(message,message));
    }
}
