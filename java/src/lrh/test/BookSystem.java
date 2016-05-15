package lrh.test ;

import java.util.ArrayList ;
import java.util.Date ;
import java.util.List ;
import java.util.Scanner ;

public class BookSystem
{
	private List < Book > books ;
	private Order order ;
	private int startId ;
	private int num ;

	public BookSystem ( List < Book > books )
	{
		super ( ) ;
		this.books = books ;
	}

	public BookSystem ( )
	{
		super ( ) ;
		// TODO Auto-generated constructor stub
	}

	public List < Book > getBooks ( )
	{
		return books ;
	}

	public void setBooks ( List < Book > books )
	{
		this.books = books ;
	}

	public Order getOrder ( )
	{
		return order ;
	}

	public void setOrder ( Order order )
	{
		this.order = order ;
	}

	public int getStartId ( )
	{
		return startId ;
	}

	public void setStartId ( int startId )
	{
		this.startId = startId ;
	}

	public int getNum ( )
	{
		return num ;
	}

	public void setNum ( int num )
	{
		this.num = num ;
	}

	public void showBookInfo ( )
	{
		System.out.println ( "Book Info" ) ;
		System.out.println ( "\tid\tname\t\t\tprice\tstorage" ) ;
		for ( Book book : this.books )
		{
			System.out.println ( book.getId ( ) + "\t"
					+ book.getName ( ) + "\t"
					+ book.getPrice ( ) + "\t"
					+ book.getStorage ( ) ) ;
		}
	}

	public void shopping ( )
	{
		// create order
		createOrder ( ) ;

		// choose Book
		int index = 3 ;
		while ( index < 3 )
		{
			// 1.choose your book
			Book book = chooseBook ( ) ;
			
			//create orderItem
			OrderItem item = new OrderItem(book.getName ( ) ,num ,  book.getPrice ( )  );
			
			//insert item to the order
			order.getItems ( ).add ( item );
			index ++;
		}
		
		//get the total
		double sum = 0.0;
		

	}

	// 1.choose your book
	private Book chooseBook ( )
	{
		System.out.println ( "choose your book id:" ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int id = sc.nextInt ( ) ;

		System.out.println ( "input your number:" ) ;
		Scanner sc2 = new Scanner ( System.in ) ;
		this.num = sc2.nextInt ( ) ;

		for ( int i = 0 ; i < books.size ( ) ; i ++ )
		{
			Book book = books.get ( i);
			if(book.getId ( ) == id)
			{
				books.get ( i ).setStorage ( books.get ( i ).getStorage ( ) - num );
				return book;
			}
		}

		return null ;
	}

	// create order
	private void createOrder ( )
	{
		this.order = new Order ( 2016 ,
				new ArrayList < OrderItem > ( ) , 0.0 ,
				new Date ( ) ) ;

	}

}
