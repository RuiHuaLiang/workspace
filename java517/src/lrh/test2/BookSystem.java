package lrh.test2 ;

import java.io.Serializable ;
import java.util.ArrayList ;
import java.util.Date ;
import java.util.List ;
import java.util.Scanner ;

public class BookSystem implements Serializable
{
	private List < Book > books ;
	private Order order ;
	private int num ;

	public BookSystem ( List < Book > books )
	{
		super ( ) ;
		this.books = books ;
	}

	// show book info
	public void showBookInfo ( )
	{
		System.out.println ( "\t\t\tBook Info" ) ;
		System.out.println ( "\tid\tname\t\t\t\tprice\tstorage" ) ;
		for ( Book book : this.books )
		{
			System.out.println ( "\t" + book.getId ( ) + "\t"
					+ book.getName ( ) + "\t\t\t\t"
					+ book.getPeice ( ) + "\t"
					+ book.getStorage ( ) ) ;
		}
	}

	// shopping
	public void shopping ( )
	{
		// create order
		createOrder ( ) ;

		int index = 0 ;
		while ( index < 3 )
		{
			// choose book
			Book book = chooseBook ( ) ;
			OrderItem item = new OrderItem ( book.getName ( ) ,
					book.getPeice ( ) , this.num ) ;
			this.order.getItems ( ).add ( item ) ;

			index ++ ;
		}

		// count the total
		double total = 0.0 ;
		for ( OrderItem item : this.order.getItems ( ) )
		{
			total += item.getPrice ( ) * item.getNum ( ) ;
		}
		this.order.setTotal ( total ) ;

	}

	// show order info
	public void showOrderInfo ( )
	{
		System.out.println ( "order info: id = " + this.order.getId ( ) ) ;
		System.out.println ( "\tbookname\tprice\tnumber" ) ;
		for ( OrderItem item : this.order.getItems ( ) )
		{
			System.out.println ( "\t" + item.getBookName ( ) + "\t"
					+ item.getPrice ( ) + "\t"
					+ item.getNum ( ) ) ;
		}
		System.out.println ( "total price:" + this.order.getTotal ( ) ) ;
	}

	// choose book
	private Book chooseBook ( )
	{
		System.out.println ( "choose your book id:" ) ;
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

	// create order
	private void createOrder ( )
	{
		this.order = new Order ( 2016 ,
				new ArrayList < OrderItem > ( ) , new Date ( ) ,
				0.0 ) ;
	}
}
