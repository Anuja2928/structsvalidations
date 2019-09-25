package com.bv.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CustomInterceptor2 implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("custom interceptor2 destryoed");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("custom interceptor2 initialized");
		
	}

	@Override
	public String intercept(ActionInvocation ai2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pre-Processing for 2");
		String result1 = ai2.invoke();
		System.out.println("Post-Processing for 2");
		return result1;
	}
	
}
