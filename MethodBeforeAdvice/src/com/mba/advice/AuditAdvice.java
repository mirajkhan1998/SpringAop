package com.mba.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.security.SecurityManager;

public class AuditAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object proxy) throws Throwable {
		String methodName = method.getName();
		SecurityManager securityManager=SecurityManager.getInstance();
		//Object[] arg =args;
		System.out.print(securityManager.getLoggedInUser()+" has approved the loan by Calling " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");

	}

}
