package com.may.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.may.bean.User;
import com.may.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao
{

	@Override
	public List<User> findAllUsers()
	{
		String hql = "from User user order by user.id asc";
		// desc

		return (List<User>) this.getHibernateTemplate().find(hql);
	}


}
