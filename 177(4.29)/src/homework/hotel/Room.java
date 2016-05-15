package homework.hotel;

import homework.Poker;

/**
 * Room����
 *   ���
 *   ���ƺ�
 *   ״̬: (��ס  ����  ά��  ���� )
 *   ����: (��׼��  ˫�м�  ���� ��ͳ�׷�)
 *   
 * @author andy
 */
public class Room {
	
	

	private int id;//���
	private String roomId;//���ƺ�
	private String state; //״̬
	private int  type ;//����
	
	//״̬
	public static final String ROOM_STATE_IN = "��ס";
	public static final String ROOM_STATE_EMPTY = "����";
	public static final String ROOM_STATE_REPAIR = "ά��";
	public static final String ROOM_STATE_ClEAR = "����";
	
	
	//����
	public static final int ROOM_TYPE_STANDARD =  0; //"��׼��";
	public static final int ROOM_TYPE_DOUBLE =   1;  //"˫�˼�";
	public static final int  ROOM_TYPE_BUSSINESS = 2;  //"����";
	public static final int ROOM_TYPE_PRESIDENT  = 3; //"��ͳ�׷�";
	
	//�۸�
	public static final int[] ROOM_PRICES = {108,188,288,588};  
	//������
	public static final String[] ROOM_TYPE_NAME = {"��׼��","˫�˼�","�����","��ͳ�׷�"};  
	
	
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
