package com.pc.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		System.out.print("entered into " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
		Object ret = methodInvocation.proceed();
		System.out.println("exiting from method with return value:" + ret);
		return ret;

	}

}
