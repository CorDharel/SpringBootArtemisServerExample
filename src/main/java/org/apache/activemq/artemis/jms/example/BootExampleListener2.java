package org.apache.activemq.artemis.jms.example;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class BootExampleListener2 {

	private MapMessage mapMessage = null;
	private String lastMessage = null;

	public BootExampleListener2() {
		System.out.println("BootExampleListener2 Constructor called");
	}

	@JmsListener(destination = "exampleTopic2")
	public void processMessage(Message message) throws JMSException {
		System.out.println("processMessage!!!");
		try {
			mapMessage = (MapMessage) message;
			lastMessage = mapMessage.getString("uuid");
		} catch (JMSException e) {
			e.printStackTrace();
		}

		System.out.println("MESSAGE RECEIVED: " + lastMessage);
	}

}
