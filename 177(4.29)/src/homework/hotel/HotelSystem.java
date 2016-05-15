package homework.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelSystem {
	private Hotel hotel;
	
	public HotelSystem(){
		init();//��ʼ������
	}
	
	public void init(){
		//1.�����������
		ArrayList rooms = new ArrayList();
		
		Room r = new Room(1,"101",Room.ROOM_STATE_EMPTY,Room.ROOM_TYPE_STANDARD);
		rooms.add(r);
		Room r1 = new Room(2,"102",Room.ROOM_STATE_EMPTY,Room.ROOM_TYPE_STANDARD);
		rooms.add(r1);
		Room r2 = new Room(3,"103",Room.ROOM_STATE_EMPTY,Room.ROOM_TYPE_DOUBLE);
		rooms.add(r2);
		Room r3 = new Room(4,"201",Room.ROOM_STATE_EMPTY,Room.ROOM_TYPE_STANDARD);
		rooms.add(r3);
		Room r4 = new Room(5,"202",Room.ROOM_STATE_EMPTY,Room.ROOM_TYPE_STANDARD);
		rooms.add(r4);
		Room r5 = new Room(6,"203",Room.ROOM_STATE_EMPTY,Room.ROOM_TYPE_STANDARD);
		rooms.add(r5);
		Room r6 = new Room(7,"308",Room.ROOM_STATE_EMPTY,Room.ROOM_TYPE_PRESIDENT);
		rooms.add(r6);
		
		//2.����һ���Ƶ����
		hotel = new Hotel(rooms);
	}
	
	//1.��ӷ���
	public void addRoom(){
		
		//1.������
		System.out.println("�����뷿����");
		Scanner sc =new Scanner(System.in);
		String roomNum = sc.nextLine();
		//2.���뷿������
		System.out.println("ѡ�񷿼�����[0]��׼��,[1]˫�˼�,[2]����[3]��ͳ�׷�");
		Scanner sc1 =new Scanner(System.in);
		int roomType = sc1.nextInt();
		
		Room r = new Room(8,roomNum,Room.ROOM_STATE_EMPTY,roomType);
		
	}
	
	public void income(){
		ArrayList rooms = hotel.getRooms();
		
		int sum = 0;
		//�������еķ���
		for(int i = 0 ; i < rooms.size() ; i++){
			Room room = (Room)rooms.get(i);
			String state = room.getState(); //��ȡ�����״̬
			int type = room.getType();//��ȡ���������
			//�жϷ���������Ƿ�����ס״̬
			if(state.equals(Room.ROOM_STATE_IN)){
				sum += Room.ROOM_PRICES[type];
			}
		}
	}
}
