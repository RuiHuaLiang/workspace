package homework.book ;

import java.util.ArrayList ;
import java.util.Date ;
import java.util.Iterator ;
import java.util.List ;
import java.util.Scanner ;

public class BookSystem
{
	private List < Book > books ;// 图书
	private Order order ;// 订单
	private static int startId ; // 开始ID
	private int num ;
	static
	{
		//
	}

	public BookSystem ( List < Book > books )
	{
		super ( ) ;
		this.books = books ;
	}

	// 打印图书信息
	public void printBookInfo ( )
	{
		// 1.获取迭代器
		Iterator < Book > it = books.iterator ( ) ;
		System.out.println ( "\t图书信息\t" ) ;
		System.out.println ( "图书id\t图书名\t\t图书价格 \t图书库存" ) ;
		while ( it.hasNext ( ) )
		{
			Book b = it.next ( ) ;
			System.out.println ( b.getId ( ) + "\t" + b.getName ( ) + "\t\t"
					+ b.getPrice ( ) + "\t" + b.getStorage ( ) ) ;
		}
	}

	public void shopping ( )
	{

		// 2.创建订单
		createOrder ( ) ;
		int index = 0 ;
		while ( index < 3 )
		{
			// 1.选择购买图书
			Book b = buyBook ( ) ;
			// 2.创建订单项
			OrderItem item = new OrderItem ( b.getName ( ) , b.getPrice ( ) ,
					num ) ;
			// 3.将订单项加入到订单中
			order.getItems ( ).add ( item ) ;
			index ++ ;
		}

		// 获取订单中的书籍
		List < OrderItem > items = order.getItems ( ) ;
		double sum = 0.0 ; // 总价
		// 计算总价
		for ( OrderItem item : items )
		{
			sum += ( item.getNum ( ) * item.getPrice ( ) ) ;
		}
		// 将总价加入到订单中
		order.setTotal ( sum ) ;
	}

	// 选择购买的图书
	private Book buyBook ( )
	{
		// 1.选择购买的图书编号
		System.out.println ( "请选择购买的图书编号:" ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int id = sc.nextInt ( ) ;

		System.out.println ( "请输入购买的数量:" ) ;
		Scanner sc1 = new Scanner ( System.in ) ;
		num = sc1.nextInt ( ) ;

		// 2.
		// a.
		int index = - 1 ; //
		for ( int i = 0 ; i < books.size ( ) ; i ++ )
		{
			Book b = books.get ( i ) ;
			if ( b.getId ( ) == id )
			{
				//
				b.setStorage ( b.getStorage ( ) - num ) ;
				return b ;
			}
		}
		return null ;
	}

	// 创建订单
	private void createOrder ( )
	{
		// 1.创建订单对象
		order = new Order ( ) ;
		// 2.订单id
		int id = 2016042901 ;
		order.setId ( id ) ;
		// 3.获取订单创建时间
		Date date = new Date ( ) ;
		order.setDate ( date ) ;
		// 4.创建订单项
		List < OrderItem > items = new ArrayList < OrderItem > ( ) ;
		order.setItems ( items ) ;
	}

	// 打印订单详细信息
	public void printDetail ( )
	{
		System.out.println ( "订单id:" + order.getId ( ) ) ;
		System.out.println ( "书名\t数量\t价格" ) ;
		List < OrderItem > items = order.getItems ( ) ;
		for ( OrderItem item : items )
		{
			System.out.println ( item.getBookName ( ) + "\t" + item.getNum ( )
					+ "\t" + item.getPrice ( ) ) ;
		}

		System.out.println ( "总价:" + order.getTotal ( ) ) ;
	}
}
