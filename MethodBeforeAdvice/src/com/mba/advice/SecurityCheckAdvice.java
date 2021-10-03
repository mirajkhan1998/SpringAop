package com.mba.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.security.SecurityManager;

public class SecurityCheckAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object proxy) throws IllegalAccessException {
		// String methodName = null;
		SecurityManager securityManager = null;
		// methodName = method.getName();
		securityManager = SecurityManager.getInstance();
		if (securityManager.authenticate() == false) {
			throw new IllegalAccessException("Invalid user/pwd");
		}

	}

}
