package homework.book ;

import java.util.ArrayList ;
import java.util.List ;

public class BookTest
{

	public static void main ( String [ ] args )
	{
		// 1.
		// a.创建图书
		List < Book > books = new ArrayList < Book > ( ) ;
		books.add ( new Book ( 1001 , "java设计模式" , 60 , 3 ) ) ;
		books.add ( new Book ( 2001 , "数据结构" , 30 , 10 ) ) ;
		books.add ( new Book ( 5001 , "算法导论" , 30 , 5 ) ) ;
		books.add ( new Book ( 8001 , "数据库" , 65 , 2 ) ) ;

		// b.创建图书购买系统
		BookSystem system = new BookSystem ( books ) ;

		// 2.打印图书信息
		system.printBookInfo ( ) ;

		// 3.购买图书
		system.shopping ( ) ;

		// 4.打印订单信息
		system.printDetail ( ) ;
	}

}
