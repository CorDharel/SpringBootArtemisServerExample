/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package how.it.would.look.without.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This Class just shows how it would look in a normal Spring Application 
 *
 */
@SpringBootApplication
public class SpringExampleMain {

	public static void main(String[] args) throws Exception {
		System.out.println("Creating bean factory...");
		
		// You could also define all the beans in an xml
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		//		new String[] { "spring-jms-beans.xml" });

		//MessageSender sender = (MessageSender) context.getBean("MessageSender");

		//System.out.println("Sending message...");
		//sender.send("Hello world");

		Thread.sleep(100);
		boolean running = true;
		Integer zaehler = 0;

		SpringApplication.run(SpringExampleMain.class, args);
		
		while (running) {

			System.out.println("Still running, trying to consume... " + zaehler);
			Thread.sleep(2000);

			zaehler += 1;

			//System.out.println("Sending second message...");
			//sender.send("Hello world 2");
			if (zaehler > 100000) {
				zaehler = 0;
			}
		}

		//context.destroy();
	}
}
