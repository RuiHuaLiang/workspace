package homework;

import java.io.Serializable;

public class Poker  implements Serializable{
	
	private String number; //����
	private String color;  //��ɫ
	//----����ɳ���--------
	//�ƵĻ�ɫ
	public static final String  COLOR_RED= "����";
	public static final String  COLOR_BLACK= "����";
	public static final String  COLOR_BLOCK= "����";
	public static final String  COLOR_CLUB= "÷��";
	//�Ƶ�ȡֵ
	public static final String  NUM_ACER = "A";
	public static final String  NUM_TWO = "2";
	public static final String  NUM_THREE = "3";
	public static final String  NUM_FOUR = "4";
	public static final String  NUM_FIVE = "5";
	public static final String  NUM_SIX = "6";
	public static final String  NUM_SEVEN = "7";
	public static final String  NUM_EIGHT = "8";
	public static final String  NUM_NINE = "9";
	public static final String  NUM_TEN = "10";
	public static final String  NUM_JACK = "J";
	public static final String  NUM_QUEEN = "Q";
	public static final String  NUM_KING = "K";
	
	
	public static final String  NUM_BLACK_KING = "С��";
	public static final String  NUM_RED_KING = "����";
	

	public Poker() {
		super();
	}
	
	public Poker(String number, String color) {
		super();
		this.number = number;
		this.color = color;
	}


	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Poker [number=" + number + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Poker){
			 Poker p = (Poker)obj;
			 return this.number == p.number && this.color == p.color;
		}
		return false;
	}
	
	
}
