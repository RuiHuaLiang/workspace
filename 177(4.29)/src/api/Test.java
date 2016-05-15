package api;

import java.util.Arrays;

/*Object:  都是使用和内存相关的概念描述。
 * hashCode  地址--->数字
 * toString  包名+hash码
 * equals()  比较地址
 * 
 * Student   需要表表达式的是现实世界中的对象信息
 *  hashCode: 唯一值   只要现实世界中对象相同 那么hashCode也应该相同  
 *  toString: 需要符合人们习惯  例如：学生: 学号 姓名
 *  equals(): 只要对象的属性内容相同，那么这个两个对象表达的是同一个现实世界的对象
 * 
 * 所以:实体类都需要重写hashCode toString equals方法。
 * **/
public class Test {
	public static void main(String[]args){
		Student stu = new Student(1001,"Tom",22);
		System.out.println(stu.hashCode());
		
		//stu调用toString 和直接输出引用 是等价的
		System.out.println(stu.toString());
		System.out.println(stu);
		
		Student stu1 = new Student(1002,"Lucy",22);
		boolean isEqual = stu.equals(stu1);
		System.out.println(isEqual);
		
		
		
		
		
		/*
		 * 1.比较地址是否相同
		 * 2.比较数组的长度  长度不同
		 * 3.比较下标相同的两个对象是否相等。
		 *    Object  obj = s1[i];
		 *    Object  obj1 = s2[i];
		 *   错误： obj == obj1; //比较的是内存地址是否相等。而不是比较的是对象内容
		 *   正确的: obj.equals(obj1); //1.判断地址 2.比较内容 
		 */
		//面试题
		Student[] s1 = new Student[]{stu,stu1};
	
		Student[] s2 = new Student[]{stu1,stu};
	    //比较两个数组是否相等。
		boolean isRes = Arrays.equals(s1, s2);
		System.out.println("数组比较的结果:"+isRes);
	
	
		
		
		/*
		 * 1.比较地址是否相同
		 * 2.比较数组的长度  长度不同
		 * 3.比较相同下标元素是否相等。
		 * 注意:如果是简单数据类型,直接将数组中的元素之值进行比较。
		 *    a[0] == b[0]  .... a[i] == b[i];
		 * **/
		int[]  a  ={1,2};
		int[]  b  ={2,1};
		Arrays.sort(b); //自然排序 即升序排序
		boolean isRe = Arrays.equals(a, b);
		System.out.println("数组比较的结果:"+isRe);
		
		
		
	
		/**
		 * javac: 检查语法: stu5.getAge();
		 * 
		 * java: stu5里面保存的地址，然后根据地址找到堆区中的对象，然后再去对象中找getAge();
		 *       stu5里面的地址都是null ,那么对象根本无法找到。方法也没有办法调用。
		 * 
		 * */
		Student stu5 = null;
		System.out.println(stu5.getAge());
		
		
		
	}
}
