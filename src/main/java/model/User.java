package model;

public class User {

	int userId;

	String name;

	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getUserId() {
		return userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
