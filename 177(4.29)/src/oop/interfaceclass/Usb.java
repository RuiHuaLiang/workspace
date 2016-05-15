package oop.interfaceclass;

/*
 * 定义接口Usb接口
 * interface关键字
 * */
public interface Usb {
	public static final String NAME ="Usb设备";  //常量
	//插入
	public abstract void insertUsb();  //抽象方法
	//移除
	public abstract void removeUsb();  //抽象方法
	
}
