package org.apache.activemq.artemis.jms.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class BootMessageSender2 {

	private final JmsTemplate jmsTemplate;

	@Autowired
	public BootMessageSender2(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	// ...

}
