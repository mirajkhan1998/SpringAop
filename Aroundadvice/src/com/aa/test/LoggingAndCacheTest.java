package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.aspect.CacheAdvice;
import com.aa.aspect.LoggingAdvice;
import com.aa.beans.Calculator;

public class LoggingAndCacheTest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LoggingAdvice());
		pf.addAdvice(new CacheAdvice());
		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(10, 20, 30);
		System.out.println("sum1:" + sum);
		int sum1 = proxy.add(10, 20, 30);
		System.out.println("sum2:" + sum1);

	}

}
