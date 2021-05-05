package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Calendar;
import model.Room;

public class RoomManager {

	Map<Integer, Room> roomMap = new HashMap<Integer, Room>();

	public Room createRoom(int roomId, String name, int capacity, boolean hasVideoConferencing, boolean hasWhiteBoard,
			Calendar calendar) {
		final Room room = new Room(roomId, name, capacity, hasVideoConferencing, hasWhiteBoard, calendar);
		roomMap.put(roomId, room);
		return room;
	}

	public List<Room> searchForRoom(int startTime, int endTime, boolean hasVideoConferencing, boolean hasWhiteBoard,
			int capacity) {
		final List<Room> roomList = new ArrayList<Room>();
		for (final Entry entry : roomMap.entrySet()) {
			final Room room = (Room) entry.getValue();
			if (room.isHasVideoConferencing() != hasVideoConferencing) {
				continue;
			}
			if (room.isHasWhiteBoard() != hasWhiteBoard) {
				continue;
			}
			if (room.getCapacity() < capacity) {
				continue;
			}
			roomList.add(room);
		}
		return roomList;
	}

}
