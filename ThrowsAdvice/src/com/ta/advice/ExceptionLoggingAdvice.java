package com.ta.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggingAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}
