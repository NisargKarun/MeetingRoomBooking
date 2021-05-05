package nisarg.nisarg;

import java.util.List;

import model.Booking;
import model.Calendar;
import model.Room;
import model.User;
import service.BookingManager;
import service.RoomManager;
import service.UserManager;
import strategy.DefaultBookingStrategy;

public class App {
	public static void main(String[] args) {
		final BookingManager BookingManager = new BookingManager(new DefaultBookingStrategy());
		final RoomManager roomManager = new RoomManager();
		final UserManager userManager = new UserManager();
		final User user1 = userManager.createUser(1, "Nisarg");
		final User user2 = userManager.createUser(2, "Man");

		final Room room1 = roomManager.createRoom(1, "1", 3, false, true, new Calendar());
		final Room room2 = roomManager.createRoom(2, "2", 5, true, true, new Calendar());

		final List<Room> roomList = roomManager.searchForRoom(0, 10, true, true, 3);
		for (final Room room : roomList) {
			System.out.println(roomList.toString());
		}
		final Booking booking = BookingManager.bookRoom(1, user1, room1, 0, 10);
		System.out.println(booking.toString());
	}
}
