package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.advice.AuditAdvice;
import com.mba.bean.LoanManager;

public class MBRTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanManager());
		pf.addAdvice(new AuditAdvice());
		LoanManager proxy = (LoanManager) pf.getProxy();
		boolean status = proxy.approvedLoan("LN15555");
		System.out.println("status:?" + status);
	}

}
