package com.may.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.may.bean.Help;
import com.may.dao.HelpDao;

public class HelpDaoImpl extends HibernateDaoSupport implements HelpDao
{

	@Override
	public List<Help> findAllHelps()
	{
		String hql = "from Help help order by help.id asc";
		// desc

		return (List<Help>) this.getHibernateTemplate().find(hql);
	}

}
