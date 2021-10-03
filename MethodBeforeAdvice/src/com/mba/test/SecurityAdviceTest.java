package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.advice.AuditAdvice;
import com.mba.advice.SecurityCheckAdvice;
import com.mba.bean.LoanManager;
import com.mba.security.SecurityManager;

public class SecurityAdviceTest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanManager());
		pf.addAdvice(new AuditAdvice());
		pf.addAdvice(new SecurityCheckAdvice());
		LoanManager proxy = (LoanManager) pf.getProxy();
		SecurityManager securityManager = SecurityManager.getInstance();
		securityManager.login("king", "root");
		boolean status = proxy.approvedLoan("LN1555258");
		System.out.println("Status:?" + status);

	}

}
