package me.ding.service.impl;

import me.ding.dao.UserDao;
import me.ding.dao.impl.UserDaoImplForMySQL;
import me.ding.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao mySQLDao;
	private UserDao oracleDao;

	public UserServiceImpl(UserDao mySQLDao, UserDao oracleDao) {
		this.mySQLDao = mySQLDao;
		this.oracleDao = oracleDao;
	}

	@Override
	public int register() {
		System.out.println("进入业务层，正在调用持久层");
		mySQLDao.insert();
		oracleDao.insert();
		return 0;
	}
}
