package lrh.booksystem ;

import java.util.ArrayList ;
import java.util.List ;

public class BookSystemTest
{
	public static void main ( String [ ] args )
	{
		// 1.crate some books
		Book book1 = new Book ( 101 , "Java Programming" , 65 , 5 ) ;
		Book book2 = new Book ( 102 , "C++ Programming" , 45 , 5 ) ;
		Book book3 = new Book ( 103 , "C# Programming" , 60 , 5 ) ;
		Book book4 = new Book ( 104 , "JavaScript Program" , 45 , 5 ) ;
		Book book5 = new Book ( 105 , "C Programming" , 85 , 5 ) ;
		List < Book > books = new ArrayList < Book > ( ) ;
		books.add ( book1 ) ;
		books.add ( book2 ) ;
		books.add ( book3 ) ;
		books.add ( book4 ) ;
		books.add ( book5 ) ;

		// 2.create BookSystem
		BookSystem bookSystem = new BookSystem ( books ) ;

		// 3.show the book info
		bookSystem.bookInfo ( ) ;

		// 4.shopping
		bookSystem.shopping ( ) ;

		// 5.Order info
		bookSystem.orderInfo ( ) ;

	}
}
