package com.lombardi.security.activemq.message;

import com.lombardi.security.activemq.model.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import static com.lombardi.security.activemq.config.JmsConfig.MAIL_TOPIC;

/**
 * @author orkun
 */

@Component
public class Receiver {

    //@JmsListener(destination = MAIL_TOPIC, containerFactory = "jmsListenerContainerFactory")
    @JmsListener(destination = MAIL_TOPIC)
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }

}
