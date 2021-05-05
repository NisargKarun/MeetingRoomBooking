package model;

import java.util.Arrays;

public class Booking {
	int id;

	User user;
	Room room;
	int[] timings;
	BookingState state;

	public Booking(int id, User user, Room room, int[] timings, BookingState state) {
		super();
		this.id = id;
		this.user = user;
		this.room = room;
		this.timings = timings;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public Room getRoom() {
		return room;
	}

	public BookingState getState() {
		return state;
	}

	public int[] getTimings() {
		return timings;
	}

	public User getUser() {
		return user;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setState(BookingState state) {
		this.state = state;
	}

	public void setTimings(int[] timings) {
		this.timings = timings;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", user=" + user + ", room=" + room + ", timings=" + Arrays.toString(timings)
				+ ", state=" + state + "]";
	}
}
