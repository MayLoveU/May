package com.may.action.user;

import java.util.Map;

import com.may.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListUserAction extends ActionSupport
{
	private UserService userService;

	public UserService getUserService()
	{
		return userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception
	{

		Map request = (Map) ActionContext.getContext().get("request");
		
		request.put("user",this.userService.findAll());
		
		return SUCCESS;
	}
}
