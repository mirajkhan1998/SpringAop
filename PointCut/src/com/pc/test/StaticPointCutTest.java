package com.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pc.advice.LoggingAdvice;
import com.pc.advice.poincut.StaticLoggingPointcut;
import com.pc.bean.Calculator;

public class StaticPointCutTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		//pf.addAdvice(new LoggingAdvice());
		pf.addAdvisor(new DefaultPointcutAdvisor(new StaticLoggingPointcut(), new LoggingAdvice()));
		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(10, 20);
		int mul = proxy.multiply(10, 20);
		System.out.println("sum: " + sum + " " + mul);

	}

}
