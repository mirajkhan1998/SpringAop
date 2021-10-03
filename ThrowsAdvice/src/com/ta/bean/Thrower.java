package com.ta.bean;

public class Thrower {
	public int willThrow(int i) {
		if (i < 1) {
			throw new IllegalArgumentException("Invalid parameter");
		}
		return i;
	}

}
