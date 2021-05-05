package model;

public class Room {
	int roomId;

	String name;
	int capacity;
	boolean hasVideoConferencing;
	boolean hasWhiteBoard;
	Calendar calendar;

	public Room(int roomId, String name, int capacity, boolean hasVideoConferencing, boolean hasWhiteBoard,
			Calendar calendar) {
		super();
		this.roomId = roomId;
		this.name = name;
		this.capacity = capacity;
		this.hasVideoConferencing = hasVideoConferencing;
		this.hasWhiteBoard = hasWhiteBoard;
		this.calendar = calendar;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getName() {
		return name;
	}

	public int getRoomId() {
		return roomId;
	}

	public boolean isHasVideoConferencing() {
		return hasVideoConferencing;
	}

	public boolean isHasWhiteBoard() {
		return hasWhiteBoard;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setHasVideoConferencing(boolean hasVideoConferencing) {
		this.hasVideoConferencing = hasVideoConferencing;
	}

	public void setHasWhiteBoard(boolean hasWhiteBoard) {
		this.hasWhiteBoard = hasWhiteBoard;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", name=" + name + ", capacity=" + capacity + ", hasVideoConferencing="
				+ hasVideoConferencing + ", hasWhiteBoard=" + hasWhiteBoard + ", calendar=" + calendar + "]";
	}

}
