package lrh.test;

import java.io.Serializable ;

public class OrderItem implements Serializable
{
	private String bookName;
	private int num;
	private double price;
	public String getBookName ( )
	{
		return bookName ;
	}
	public void setBookName ( String bookName )
	{
		this.bookName = bookName ;
	}
	public int getNum ( )
	{
		return num ;
	}
	public void setNum ( int num )
	{
		this.num = num ;
	}
	public double getPrice ( )
	{
		return price ;
	}
	public void setPrice ( double price )
	{
		this.price = price ;
	}
	public OrderItem ( String bookName , int num , double price )
	{
		super ( ) ;
		this.bookName = bookName ;
		this.num = num ;
		this.price = price ;
	}
	public OrderItem ( )
	{
		super ( ) ;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode ( )
	{
		final int prime = 31 ;
		int result = 1 ;
		result = prime
				* result
				+ ( ( bookName == null ) ? 0 : bookName
						.hashCode ( ) ) ;
		result = prime * result + num ;
		long temp ;
		temp = Double.doubleToLongBits ( price ) ;
		result = prime * result + ( int ) ( temp ^ ( temp >>> 32 ) ) ;
		return result ;
	}
	@Override
	public boolean equals ( Object obj )
	{
		if ( this == obj )
			return true ;
		if ( obj == null )
			return false ;
		if ( getClass ( ) != obj.getClass ( ) )
			return false ;
		OrderItem other = ( OrderItem ) obj ;
		if ( bookName == null )
		{
			if ( other.bookName != null )
				return false ;
		} else if ( ! bookName.equals ( other.bookName ) )
			return false ;
		if ( num != other.num )
			return false ;
		if ( Double.doubleToLongBits ( price ) != Double
				.doubleToLongBits ( other.price ) )
			return false ;
		return true ;
	}
	@Override
	public String toString ( )
	{
		return "OrderItem [bookName=" + bookName + ", num=" + num
				+ ", price=" + price + "]" ;
	}
	
	
}
