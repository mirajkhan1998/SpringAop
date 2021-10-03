package com.aa.bean;

public class KeyGenerator {
	public int generateKey(int len) {
		if (len < 8) {
			return 0;
		} 
		return 1;
	}

}
