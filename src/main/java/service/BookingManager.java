package service;

import java.util.HashMap;
import java.util.Map;

import model.Booking;
import model.BookingState;
import model.Room;
import model.User;
import strategy.BookingStrategy;

public class BookingManager {

	BookingStrategy bookingStrategy;
	Map<Integer, Booking> BookingMap;

	public BookingManager(BookingStrategy bookingStrategy) {
		super();
		this.bookingStrategy = bookingStrategy;
		BookingMap = new HashMap<Integer, Booking>();
	}

	public Booking bookRoom(int bookingId, User user, Room room, int startTime, int endTime) {
		final Booking booking = new Booking(bookingId, user, room, null, BookingState.Pending);

		try {
			if (bookingStrategy.bookRoom(room, startTime, endTime)) {
				System.out.println("Booking done");
				booking.setState(BookingState.Booked);
			}

		} catch (final Exception e) {
			System.out.println("Booking done for other user.");
		}
		BookingMap.put(bookingId, booking);
		return booking;

	}

	public void cancelRoom(int bookingId) {

		final Booking booking = BookingMap.get(bookingId);
		booking.setState(BookingState.Cancelled);
	}

	public void rescheduleRoom(int bookingId, int startTime, int endTime) {
		final Booking booking = BookingMap.get(bookingId);
		booking.setState(BookingState.Rescheduled);
		bookRoom(booking.getId(), booking.getUser(), booking.getRoom(), startTime, endTime);
	}

}
