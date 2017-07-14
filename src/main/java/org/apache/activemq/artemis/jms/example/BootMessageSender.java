package org.apache.activemq.artemis.jms.example;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class BootMessageSender {

	private final JmsTemplate jmsTemplate;

	@Autowired
    public BootMessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
	
	//@PostConstruct
	public void test(){
		sendMessage("Test");
	}
	
	
	public void sendMessage(final String message){
		jmsTemplate.send("exampleTopic", new MessageCreator() {
	        @Override
			public Message createMessage(Session session) throws JMSException {

	            return session.createTextMessage(message);
	        }
	    });
		
	}

}
