package oop.interfaceclass.example;

public class Center implements IPrint {
	private IPrinter printer;

	public IPrinter getPrinter() {
		return printer;
	}
	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}
	
	public String show(){
		return "���ĵ���ϸ��Ϣ";
	}
	
	
	public void  show(IPrint p){
		String detail = p.show();
		 printer.print(detail);
	}
	
	
	
}
