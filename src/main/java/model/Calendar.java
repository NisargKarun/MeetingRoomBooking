package model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	List<Integer[]> bookingsList;

	public Calendar() {
		super();
		bookingsList = new ArrayList<Integer[]>();
	}

	public List<Integer[]> getBookingsList() {
		return bookingsList;
	}

	public void setBookingsList(List<Integer[]> bookingsList) {
		this.bookingsList = bookingsList;
	}
}
