package api.date;

public class ForExample {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("��ʼʱ��:"+System.currentTimeMillis());
		int sum = 0;
		for(int i = 0; i <= 100000000; i++){
			sum += i;
		}		
		System.out.println("������ʱ�䣺"+System.currentTimeMillis());
		long end = System.currentTimeMillis();
		System.out.println("���ĵ�ʱ��:"+(end- start));
	}

}
