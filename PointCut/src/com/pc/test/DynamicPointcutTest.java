package com.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pc.advice.LoggingAdvice;
import com.pc.advice.poincut.DynamicLoggingPointcut;
import com.pc.bean.Calculator;

public class DynamicPointcutTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvisor(new DefaultPointcutAdvisor(new DynamicLoggingPointcut(), new LoggingAdvice()));
		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(60, 30);
		System.out.println("sum:" + sum);
	}

}
