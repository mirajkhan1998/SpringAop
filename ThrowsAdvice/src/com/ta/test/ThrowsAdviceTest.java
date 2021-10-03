package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.advice.ExceptionLoggingAdvice;
import com.ta.bean.Thrower;

public class ThrowsAdviceTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Thrower());
		pf.addAdvice(new ExceptionLoggingAdvice());
		Thrower proxy = (Thrower) pf.getProxy();
		int i = proxy.willThrow(0);
		System.out.println("i:" + i);
	}

}
