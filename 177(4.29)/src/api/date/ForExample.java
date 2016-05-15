package api.date;

public class ForExample {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("开始时间:"+System.currentTimeMillis());
		int sum = 0;
		for(int i = 0; i <= 100000000; i++){
			sum += i;
		}		
		System.out.println("结束的时间："+System.currentTimeMillis());
		long end = System.currentTimeMillis();
		System.out.println("消耗的时间:"+(end- start));
	}

}
