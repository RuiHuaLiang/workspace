package lava ;

import java.util.ArrayList ;
import java.util.List ;

public class Test
{
	public static void main ( String [ ] args )
	{ 
		//create book;
		List<Book> books = new ArrayList<Book>();
		books.add ( new Book(101,"C",45.0,5) );
		books.add ( new Book(102,"C#",25.0,5) );
		books.add ( new Book(103,"C++",35.0,5) );
		books.add ( new Book(104,"java",65.0,5) );
		
		BookSystem sys = new BookSystem ( books );
		
		//show book info
		sys.showBookInfo ( );
		
		//shopping
		sys.shooping ( );
		
		//show order info
		sys.showOrderInfo ( );
	}
}
