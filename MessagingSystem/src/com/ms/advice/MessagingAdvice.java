package com.ms.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.ms.bean.Bill;
import com.ms.helper.MessagingService;

public class MessagingAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method method, Object[] args, Object proxy) throws Throwable {
		String toMobileNo = null;
		String fromMobileNo = null;
		Bill bill = null;
		String message = null;
		MessagingService messagingService = null;
		fromMobileNo = "RelianceFresh";
		toMobileNo = (String) args[1];
		bill = (Bill) ret;
		messagingService = new MessagingService();
		message = "(sendingMessageToMobile)You have shopped today for Rs " + bill.getAmount() + " your billNo is:" + bill.getBillNo()
				+ ": Thank You";

		messagingService.sendMessage(fromMobileNo, toMobileNo, message);
	}

}
