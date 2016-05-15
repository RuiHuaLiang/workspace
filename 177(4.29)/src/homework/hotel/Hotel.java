package homework.hotel;

import java.util.ArrayList;

/**
 * 酒店管理系统
 *   房间
 * @author andy
 */
public class Hotel {
	
	private  ArrayList  rooms;

	public Hotel() {
		super();
	}
	
	public Hotel(ArrayList rooms) {
		super();
		this.rooms = rooms;
	}
	
	
	public ArrayList getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList rooms) {
		this.rooms = rooms;
	}
	
}

