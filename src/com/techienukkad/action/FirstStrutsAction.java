package com.techienukkad.action;

public class FirstStrutsAction {

	String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public String execute()
	{
		return "success" ;
	}
}
