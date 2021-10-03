package com.aa.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.aa.exception.WeakKeyException;

public class ValidateKeyAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method method, Object[] args, Object proxy) throws Throwable {
		int key = (Integer) ret;
		if (key <= 0) {
			throw new WeakKeyException("weak key");
		}

	}

}
