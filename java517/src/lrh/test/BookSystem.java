package lrh.test ;

import java.util.ArrayList ;
import java.util.Date ;
import java.util.List ;
import java.util.Scanner ;

public class BookSystem
{
	private List < Book > books ;
	private Order order ;
	private int num ;
	private double totla ;

	public BookSystem ( List < Book > books )
	{
		super ( ) ;
		this.books = books ;
	}

	public void showBookInfo ( )
	{
		System.out.println ( "\t\t\tBook Info" ) ;
		System.out.println ( "\t\t\tid\t\tname\t\t\tprice\t\tstorage" ) ;
		for ( Book book : this.books )
		{
			System.out.println ( "\t\t\t" + book.getId ( ) + "\t\t"
					+ book.getName ( ) + "\t\t\t"
					+ book.getPrice ( ) + "\t\t"
					+ book.getStorage ( ) ) ;
		}
	}

	public void shopping ( )
	{
		createOrder ( ) ;

		int index = 0 ;
		while ( index < 3 )
		{
			Book book = chooseBook ( ) ;
			OrderItem item = new OrderItem ( book.getName ( ) ,
					book.getPrice ( ) , this.num ) ;

			this.order.getItems ( ).add ( item ) ;
			index ++;
		}

		for ( OrderItem item : this.order.getItems ( ) )
		{
			this.totla += item.getPrice ( ) * item.getNum ( ) ;
		}
	}

	public void showInfo ( )
	{
		System.out.println ( "bookName\t\tprice\t\tnum" ) ;
		for ( OrderItem item : this.order.getItems ( ) )
		{
			System.out.println ( item.getBookName ( ) + "\t\t"
					+ item.getPrice ( ) + "\t\t"
					+ item.getNum ( ) ) ;
		}
		System.out.println ( this.totla ) ;
	}

	private Book chooseBook ( )
	{

		System.out.println ( "choose your book id :" ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int id = sc.nextInt ( ) ;

		System.out.println ( "input the number:" ) ;
		Scanner sc2 = new Scanner ( System.in ) ;
		this.num = sc2.nextInt ( ) ;

		for ( int i = 0 ; i < this.books.size ( ) ; i ++ )
		{
			Book book = this.books.get ( i ) ;
			if ( book.getId ( ) == id )
			{
				return book ;
			}
		}

		return null ;
	}

	private void createOrder ( )
	{
		this.order = new Order ( 2016 ,
				new ArrayList < OrderItem > ( ) , new Date ( ) ) ;
	}

}
