package me.ding;

import me.ding.web.UserAction;
import org.junit.Test;

public class Main {
	@Test
	public void testAction() {
		UserAction userAction = new UserAction();
		userAction.doRegister();
	}
}
