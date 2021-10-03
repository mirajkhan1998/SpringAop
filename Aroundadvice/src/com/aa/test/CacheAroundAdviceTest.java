package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.aspect.CacheAdvice;
import com.aa.beans.Calculator;

public class CacheAroundAdviceTest {
	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Calculator());
		factory.addAdvice(new CacheAdvice());
		Calculator proxy = (Calculator) factory.getProxy();
		int sum = proxy.add(10, 20, 36);
		System.out.println("sum:" + sum);
		int sum1 = proxy.add(10, 20, 33);
		System.out.println("sum:" + sum1);
	}

}
