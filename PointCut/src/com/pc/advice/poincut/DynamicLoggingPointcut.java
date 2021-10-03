package com.pc.advice.poincut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.pc.bean.Calculator;

public class DynamicLoggingPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classType, Object... args) {
		int a = (Integer) args[0];
		int b = (Integer) args[1];
		if (classType.isAssignableFrom(Calculator.class)) {
			if (method.getName().equals("add") && a > 10 && b > 20) {
				return true;
			}
		}
		return false;
	}

}
