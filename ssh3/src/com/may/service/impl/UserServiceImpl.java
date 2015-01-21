package com.may.service.impl;

import java.util.List;

import com.may.bean.User;
import com.may.dao.UserDao;
import com.may.service.UserService;

public class UserServiceImpl implements UserService
{

	private UserDao userDao;

	public UserDao getUserDao()
	{
		return userDao;
	}

	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

	
	@Override
	public List<User> findAll()
	{
		return this.userDao.findAllUsers();
	}
	

}
