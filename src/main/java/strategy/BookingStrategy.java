package strategy;

import model.Room;

public interface BookingStrategy {
	boolean bookRoom(Room room, int startTime, int endTime);

}
