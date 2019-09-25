package com.bv.model;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	   @Override 
	   public String execute() throws Exception {
		   System.out.println("inside hello action" +getClass());
		   return SUCCESS;
		 
	   }
	
	
}
