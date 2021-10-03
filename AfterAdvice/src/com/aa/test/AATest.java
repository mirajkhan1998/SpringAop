package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.advice.ValidateKeyAdvice;
import com.aa.bean.KeyGenerator;

public class AATest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new KeyGenerator());
		pf.addAdvice(new ValidateKeyAdvice());
		KeyGenerator proxy = (KeyGenerator) pf.getProxy();
		int length = proxy.generateKey(2);
		System.out.println(length);
		//int length1=proxy.generateKey(10);
		//System.out.println(length1);

	}

}
