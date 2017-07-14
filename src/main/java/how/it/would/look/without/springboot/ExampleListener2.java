package how.it.would.look.without.springboot;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * This Class just shows how it would look in a normal Spring Application 
 *
 */
public class ExampleListener2 implements MessageListener {

	protected static String lastMessage = null;

	@Override
	public void onMessage(Message message) {
		try {
			lastMessage = ((TextMessage) message).getText();
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
		System.out.println("MESSAGE RECEIVED 2: " + lastMessage);
	}
}
