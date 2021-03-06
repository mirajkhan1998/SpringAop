package com.aa.helper;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	private static Cache instance;
	private static Map<String, Object> dataMap;

	private Cache() {
		dataMap = new HashMap<>();
	}

	public static synchronized Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
	}

	public void put(String key, Object data) {
		dataMap.put(key, data);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean containsKey(String key) {
		return dataMap.containsKey(key);
	}

}
