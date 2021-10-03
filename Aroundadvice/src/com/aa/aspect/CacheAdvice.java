package com.aa.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.helper.Cache;

public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;
		Cache cache = null;
		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		cache = Cache.getInstance();
		key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key += args[i];
			}
			key += "," + args[i];
		}
		key += ")";

		if (cache.containsKey(key) == true) {
			return cache.get(key);
		}
		Object ret = methodInvocation.proceed();
		cache.put(key, ret);

		return ret;
	}

}
