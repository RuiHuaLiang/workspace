package homework.hotel;

import java.util.ArrayList;

/**
 * �Ƶ����ϵͳ
 *   ����
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

