package lrh.test;

import java.io.Serializable ;

public class Book implements Serializable
{
	private int id;
	private String name;
	private double price;
	private int storage;
	public int getId ( )
	{
		return id ;
	}
	public void setId ( int id )
	{
		this.id = id ;
	}
	public String getName ( )
	{
		return name ;
	}
	public void setName ( String name )
	{
		this.name = name ;
	}
	public double getPrice ( )
	{
		return price ;
	}
	public void setPrice ( double price )
	{
		this.price = price ;
	}
	public int getStorage ( )
	{
		return storage ;
	}
	public void setStorage ( int storage )
	{
		this.storage = storage ;
	}
	public Book ( int id , String name , double price , int storage )
	{
		super ( ) ;
		this.id = id ;
		this.name = name ;
		this.price = price ;
		this.storage = storage ;
	}
	public Book ( )
	{
		super ( ) ;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode ( )
	{
		final int prime = 31 ;
		int result = 1 ;
		result = prime * result + id ;
		result = prime * result
				+ ( ( name == null ) ? 0 : name.hashCode ( ) ) ;
		long temp ;
		temp = Double.doubleToLongBits ( price ) ;
		result = prime * result + ( int ) ( temp ^ ( temp >>> 32 ) ) ;
		result = prime * result + storage ;
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
		Book other = ( Book ) obj ;
		if ( id != other.id )
			return false ;
		if ( name == null )
		{
			if ( other.name != null )
				return false ;
		} else if ( ! name.equals ( other.name ) )
			return false ;
		if ( Double.doubleToLongBits ( price ) != Double
				.doubleToLongBits ( other.price ) )
			return false ;
		if ( storage != other.storage )
			return false ;
		return true ;
	}
	@Override
	public String toString ( )
	{
		return "Book [id=" + id + ", name=" + name + ", price=" + price
				+ ", storage=" + storage + "]" ;
	}
	
	
}
