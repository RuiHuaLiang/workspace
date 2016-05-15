package lrh.booksystem ;

import java.util.ArrayList ;
import java.util.Date ;
import java.util.Iterator ;
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

	}

	// show the book info
	public void bookInfo ( )
	{
		Iterator < Book > iterator = this.books.iterator ( ) ;
		System.out.println ( "\t\t BOOK INFO" ) ;
		System.out.println ( "\tBookId\tBookName\t\t\t\tPrice\t\tstorage" ) ;
		while ( iterator.hasNext ( ) )
		{
			Book book = iterator.next ( ) ;
			System.out.println ( "\t" + book.getId ( ) + "\t\t"
					+ book.getName ( ) + "\t\t\t"
					+ book.getPrice ( ) + "\t\t\t"
					+ book.getStorage ( ) ) ;
			//
			// System.out.println ( "\t" + iterator.next ( ).getId (
			// )
			// + "\t" + iterator.next ( ).getName ( )
			// + "\t" + iterator.next ( ).getPrice ( )
			// + "\t"
			// + iterator.next ( ).getStorage ( ) ) ;
		}
	}

	// shopping
	public void shopping ( )
	{
		// 1.create the Order
		createOder ( ) ;

		// 2.buy books
		int index = 0 ;
		while ( index < 3 )
		{
			// 2.1.choose book
			Book book = chooseBook ( ) ;

			// 2.2.create OrderItem
			OrderItem item = new OrderItem ( book.getName ( ) ,
					book.getPrice ( ) , this.num ) ;
			this.order.getItems ( ).add ( item ) ;

			index ++ ;
		}

		// 3.get the total price
		List < OrderItem > items = this.order.getItems ( ) ;
		double total = 0.0 ;
		for ( OrderItem item : items )
		{
			total += item.getPrice ( ) * item.getNum ( ) ;
		}
		this.order.setTotal ( total ) ;
	}

	// show the Order info
	public void orderInfo ( )
	{
		System.out.println ( "Order Id:" + this.order.getId ( ) ) ;
		System.out.println ( "\tBookName\tnum\tprice" ) ;
		for ( OrderItem item : this.order.getItems ( ) )
		{
			System.out.println ( "\t" + item.getBookName ( ) + "\t"
					+ item.getNum ( ) + "\t"
					+ item.getPrice ( ) ) ;
			;
		}
		System.out.println ( "total:" + this.order.getTotal ( ) ) ;
	}

	// 2.1.choose book
	private Book chooseBook ( )
	{
		System.out.println ( "Please choose the bookId: " ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int id = sc.nextInt ( ) ;

		System.out.println ( "Please input the number of you want to buy:" ) ;
		Scanner sc2 = new Scanner ( System.in ) ;
		this.num = sc2.nextInt ( ) ;

		for ( int i = 0 ; i < this.books.size ( ) ; i ++ )
		{
			Book book = books.get ( i ) ;
			if ( book.getId ( ) == id )
			{
				book.setStorage ( book.getStorage ( ) - num ) ;
				return book ;
			}
		}
		return null ;
	}

	// 1.create the Order
	private void createOder ( )
	{
		this.order = new Order ( ) ;
		this.order.setId ( 2016 ) ;
		this.order.setDate ( new Date ( ) ) ;
		List < OrderItem > items = new ArrayList < OrderItem > ( ) ;
		this.order.setItems ( items ) ;
	}
}
