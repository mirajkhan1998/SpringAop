package com.pc.advice.poincut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.pc.bean.Calculator;

public class StaticLoggingPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classType) {
		if (method.getName().equals("add") && classType.isAssignableFrom(Calculator.class)) {
			return true;
		}
		return false;
	}

}
