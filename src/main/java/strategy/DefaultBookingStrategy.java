package strategy;

import java.util.Iterator;
import java.util.List;

import model.Calendar;
import model.Room;

public class DefaultBookingStrategy implements BookingStrategy {

	public boolean bookRoom(Room room, int startTime, int endTime) {
		synchronized (room) {
//			final Calendar calendar = room.getCalendar();
//			final TreeSet<Integer[]> bookingsList = calendar.getBookingsList();
//			final Iterator<Integer[]> iterator = bookingsList.iterator();
//			while (iterator.hasNext()) {
//				final Integer[] curBooking = iterator.next();
//				if (curBooking[1] < startTime) {
//					continue;
//				}
//				if (curBooking[1] > startTime && curBooking[0] < startTime
//						|| curBooking[1] > endTime && curBooking[0] < endTime) {
//					return false;
//				} else {
//					bookingsList.add(new Integer[] { startTime, endTime });
//					calendar.setBookingsList(bookingsList);
//					room.setCalendar(calendar);
//					return true;
//				}
//
//			}
			final Calendar calendar = room.getCalendar();
			final List<Integer[]> bookingsList = calendar.getBookingsList();
			final Iterator<Integer[]> iterator = bookingsList.iterator();
			final Integer[] book = new Integer[2];
			book[0] = startTime;
			book[1] = endTime;
			bookingsList.add(book);
			calendar.setBookingsList(bookingsList);
			room.setCalendar(calendar);
			return true;
		}
	}

}
