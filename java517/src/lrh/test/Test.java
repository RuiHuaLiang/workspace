package lrh.test;

import java.util.ArrayList ;
import java.util.List ;

public class Test
{
	public static void main ( String [ ] args )
	{
		//create some book
		List<Book> books = new ArrayList<Book>();
		books.add ( new Book(101,"C ",45.0,5) );
		books.add ( new Book(102,"java ",50.0,5) );
		books.add ( new Book(103,"C# ",30.0,5) );
		books.add ( new Book(104,"python ",60.0,5) );
		
		BookSystem system = new BookSystem(books);
		
		system.showBookInfo ( );
		
		//shopping
		system.shopping ( );
		
		//show info
		system.showOrderInfo ( );
		
	}
}
