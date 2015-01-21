package com.may.action.help;

import java.util.Map;

import com.may.service.HelpService;
import com.may.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListHelpAction extends ActionSupport
{
	private HelpService helpService;
	
	


	public HelpService getHelpService()
	{
		return helpService;
	}




	public void setHelpService(HelpService helpService)
	{
		this.helpService = helpService;
	}




	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception
	{

		Map request = (Map) ActionContext.getContext().get("request");
		
		request.put("help",this.helpService.findAllHelps());
		
		return SUCCESS;
	}
}
