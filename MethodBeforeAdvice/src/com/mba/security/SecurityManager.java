package com.mba.security;

public class SecurityManager {
	private static SecurityManager instance;
	private static ThreadLocal<User> threadLocal;
	User user;

	private SecurityManager() {
		threadLocal = new ThreadLocal<User>();
	}

	public static SecurityManager getInstance() {
		if (instance == null) {
			instance = new SecurityManager();
		}
		return instance;
	}

	public void login(String un, String pwd) {
		user = new User(un, pwd);
		threadLocal.set(user);

	}

	public void logout() {
		threadLocal.set(null);
	}

	public boolean authenticate() {
		if (user != null) {
			if (user.getUser().equals("king") && user.getPwd().equals("root")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		if (user != null) {
			return user.getUser();
		}
		return null;

	}

}
