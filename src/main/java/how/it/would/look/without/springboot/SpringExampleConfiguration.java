package how.it.would.look.without.springboot;

import org.springframework.context.annotation.Configuration;

/**
 * This Class just shows how the configuration would look in a normal Spring Application 
 *
 */

@Configuration
public class SpringExampleConfiguration {

/*
	@Bean
	public ActiveMQTopic exampleRequestTopic() {
		return new ActiveMQTopic("exampleRequestTopic");
	}

	@Bean
	public ActiveMQTopic exampleResponseTopic() {
		return new ActiveMQTopic("exampleResponseTopic");
	}

	@Bean
	public ExampleListener listener() {
		return new ExampleListener();
	}

	@Bean
	public ExampleListener listener2() {
		return new ExampleListener();
	}

	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		TransportConfiguration transportConfiguration = new TransportConfiguration(
				NettyConnectorFactory.class.getName());
		return new ActiveMQConnectionFactory(false, transportConfiguration);
	}

	@Bean
	public MessageSender messageSender() {
		MessageSender messageSender = new MessageSender();
		messageSender.setConnectionFactory(connectionFactory());
		messageSender.setDestination(exampleRequestTopic());
		return messageSender;
	}

	@Bean
	public MessageSender messageSender2() {
		MessageSender messageSender2 = new MessageSender();
		messageSender2.setConnectionFactory(connectionFactory());
		messageSender2.setDestination(exampleResponseTopic());
		return messageSender2;
	}

	@Bean
	public DefaultMessageListenerContainer listenerContainer() {
		DefaultMessageListenerContainer listenerContainer = new DefaultMessageListenerContainer();
		listenerContainer.setConnectionFactory(connectionFactory());
		listenerContainer.setDestination(exampleRequestTopic());
		listenerContainer.setMessageListener(listener());
		return listenerContainer;
	}

	@Bean
	public DefaultMessageListenerContainer listenerContainer2() {
		DefaultMessageListenerContainer listenerContainer2 = new DefaultMessageListenerContainer();
		listenerContainer2.setConnectionFactory(connectionFactory());
		listenerContainer2.setDestination(exampleRequestTopic());
		listenerContainer2.setMessageListener(listener());
		return listenerContainer2;
	}

	@Bean(initMethod="start", destroyMethod="close")
	public SpringJmsBootstrap embeddedJms() {
		SpringJmsBootstrap embeddedJms = new SpringJmsBootstrap();
		embeddedJms.setSecurityManager(securityManager());
		return embeddedJms;
	}

	@Bean
	public ActiveMQJAASSecurityManager securityManager() {

		Map<String, String> users = new HashMap<String, String>();
		users.put("example", "examplepassword");

		List<String> roleList = new ArrayList<String>();
		roleList.add("example");

		Map<String, List<String>> roles = new HashMap<String, List<String>>();
		roles.put("example", roleList);

		SecurityConfiguration securityConfiguration = new SecurityConfiguration(users, roles);
		securityConfiguration.setDefaultUser("example");

		ActiveMQJAASSecurityManager securityManager = new ActiveMQJAASSecurityManager(InVMLoginModule.class.getName(),
				securityConfiguration);
		return securityManager;
	}
*/
	

}
