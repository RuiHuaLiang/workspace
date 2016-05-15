package api;

import java.util.Arrays;

/*Object:  ����ʹ�ú��ڴ���صĸ���������
 * hashCode  ��ַ--->����
 * toString  ����+hash��
 * equals()  �Ƚϵ�ַ
 * 
 * Student   ��Ҫ����ʽ������ʵ�����еĶ�����Ϣ
 *  hashCode: Ψһֵ   ֻҪ��ʵ�����ж�����ͬ ��ôhashCodeҲӦ����ͬ  
 *  toString: ��Ҫ��������ϰ��  ���磺ѧ��: ѧ�� ����
 *  equals(): ֻҪ���������������ͬ����ô����������������ͬһ����ʵ����Ķ���
 * 
 * ����:ʵ���඼��Ҫ��дhashCode toString equals������
 * **/
public class Test {
	public static void main(String[]args){
		Student stu = new Student(1001,"Tom",22);
		System.out.println(stu.hashCode());
		
		//stu����toString ��ֱ��������� �ǵȼ۵�
		System.out.println(stu.toString());
		System.out.println(stu);
		
		Student stu1 = new Student(1002,"Lucy",22);
		boolean isEqual = stu.equals(stu1);
		System.out.println(isEqual);
		
		
		
		
		
		/*
		 * 1.�Ƚϵ�ַ�Ƿ���ͬ
		 * 2.�Ƚ�����ĳ���  ���Ȳ�ͬ
		 * 3.�Ƚ��±���ͬ�����������Ƿ���ȡ�
		 *    Object  obj = s1[i];
		 *    Object  obj1 = s2[i];
		 *   ���� obj == obj1; //�Ƚϵ����ڴ��ַ�Ƿ���ȡ������ǱȽϵ��Ƕ�������
		 *   ��ȷ��: obj.equals(obj1); //1.�жϵ�ַ 2.�Ƚ����� 
		 */
		//������
		Student[] s1 = new Student[]{stu,stu1};
	
		Student[] s2 = new Student[]{stu1,stu};
	    //�Ƚ����������Ƿ���ȡ�
		boolean isRes = Arrays.equals(s1, s2);
		System.out.println("����ȽϵĽ��:"+isRes);
	
	
		
		
		/*
		 * 1.�Ƚϵ�ַ�Ƿ���ͬ
		 * 2.�Ƚ�����ĳ���  ���Ȳ�ͬ
		 * 3.�Ƚ���ͬ�±�Ԫ���Ƿ���ȡ�
		 * ע��:����Ǽ���������,ֱ�ӽ������е�Ԫ��ֵ֮���бȽϡ�
		 *    a[0] == b[0]  .... a[i] == b[i];
		 * **/
		int[]  a  ={1,2};
		int[]  b  ={2,1};
		Arrays.sort(b); //��Ȼ���� ����������
		boolean isRe = Arrays.equals(a, b);
		System.out.println("����ȽϵĽ��:"+isRe);
		
		
		
	
		/**
		 * javac: ����﷨: stu5.getAge();
		 * 
		 * java: stu5���汣��ĵ�ַ��Ȼ����ݵ�ַ�ҵ������еĶ���Ȼ����ȥ��������getAge();
		 *       stu5����ĵ�ַ����null ,��ô��������޷��ҵ�������Ҳû�а취���á�
		 * 
		 * */
		Student stu5 = null;
		System.out.println(stu5.getAge());
		
		
		
	}
}
