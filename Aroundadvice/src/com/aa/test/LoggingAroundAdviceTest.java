package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.aspect.LoggingAdvice;
import com.aa.beans.Calculator;

public class LoggingAroundAdviceTest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LoggingAdvice());
		Calculator proxy = (Calculator) pf.getProxy();
		double sum = proxy.add(10, 20, 30);

		System.out.println("sum=" + sum);

	}

}
