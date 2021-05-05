package service;

import java.util.HashMap;
import java.util.Map;

import model.User;

public class UserManager {

	Map<Integer, User> userMap = new HashMap<Integer, User>();

	public User createUser(int userId, String name) {
		final User user = new User(userId, name);
		userMap.put(userId, user);
		return user;
	}

	public User getUser(int userId) {
		return userMap.get(userId);
	}

}
