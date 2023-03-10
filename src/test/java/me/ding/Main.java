package me.ding;

import me.ding.web.UserAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@Test
	public void testAction() {
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		UserAction ua = spring.getBean("userAction", UserAction.class);
		ua.doRegister();
	}
}