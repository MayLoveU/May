package com.may.service.impl;

import java.util.List;

import com.may.bean.Help;
import com.may.dao.HelpDao;
import com.may.service.HelpService;

public class HelpServiceImpl implements HelpService
{

	private HelpDao helpDao;


	
	public HelpDao getHelpDao()
	{
		return helpDao;
	}



	public void setHelpDao(HelpDao helpDao)
	{
		this.helpDao = helpDao;
	}



	@Override
	public List<Help> findAllHelps()
	{
		return this.helpDao.findAllHelps();
	}

}
