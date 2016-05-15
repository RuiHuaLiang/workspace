package homework.hotel;

import homework.Poker;

/**
 * Room房间
 *   编号
 *   门牌号
 *   状态: (入住  空闲  维修  清理 )
 *   类型: (标准间  双刃间  商务房 总统套房)
 *   
 * @author andy
 */
public class Room {
	
	

	private int id;//编号
	private String roomId;//门牌号
	private String state; //状态
	private int  type ;//类型
	
	//状态
	public static final String ROOM_STATE_IN = "入住";
	public static final String ROOM_STATE_EMPTY = "空闲";
	public static final String ROOM_STATE_REPAIR = "维修";
	public static final String ROOM_STATE_ClEAR = "清理";
	
	
	//类型
	public static final int ROOM_TYPE_STANDARD =  0; //"标准间";
	public static final int ROOM_TYPE_DOUBLE =   1;  //"双人间";
	public static final int  ROOM_TYPE_BUSSINESS = 2;  //"商务房";
	public static final int ROOM_TYPE_PRESIDENT  = 3; //"总统套房";
	
	//价格
	public static final int[] ROOM_PRICES = {108,188,288,588};  
	//类型名
	public static final String[] ROOM_TYPE_NAME = {"标准间","双人间","商务间","总统套房"};  
	
	
	public Room(){
		
	}
	
	public Room(int id, String roomId, String state, int type) {
		super();
		this.id = id;
		this.roomId = roomId;
		this.state = state;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Room [id=" + id + ", roomId=" + roomId + ", state=" + state
				+ ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
	    return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Room){
			 Room r = (Room)obj;
			 return r.getId() == this.getId();
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
