package me.ding.dao.impl;

import me.ding.dao.UserDao;

public class UserDaoImplForOracle implements UserDao {
	@Override
	public int insert() {
		System.out.println("进入持久层，Oracle 数据库正在执行插入");
		return 0;
	}
}