package com.ms.test;

import java.util.Arrays;

import org.springframework.aop.framework.ProxyFactory;

import com.ms.advice.MessagingAdvice;
import com.ms.bean.Bill;
import com.ms.bean.BillGenerator;
public class MessagingSystemTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new BillGenerator());
		//pf.addAdvice(new MessagingAdvice());
		BillGenerator proxy = (BillGenerator) pf.getProxy();
		Bill bill=proxy.generateBill(Arrays.asList("Kitchen utencil", "Merchant orders"), "9546837806");
		System.out.println(bill);
	}

}
