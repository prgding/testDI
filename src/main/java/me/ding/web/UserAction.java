package me.ding.web;

import me.ding.service.UserService;
import me.ding.service.impl.UserServiceImpl;

public class UserAction {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void doRegister(){
		System.out.println("进入表示层，正在调用业务层");
		userService.register();
	}
}
