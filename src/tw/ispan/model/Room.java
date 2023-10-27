package tw.ispan.model;

public class Room {

	private int roomId;
	private String roomName;
	private String size;

	public int getRoomId() {
		return roomId;
	}
	

	public Room(int roomId, String roomName, String size) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.size = size;
	}



	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
