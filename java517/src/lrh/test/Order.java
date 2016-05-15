package lrh.test;

import java.io.Serializable ;
import java.util.Date ;
import java.util.List ;

public class Order implements Serializable
{
	private int id;
	private List<OrderItem> items;
	private Date date;
	
	
	public int getId ( )
	{
		return id ;
	}
	public void setId ( int id )
	{
		this.id = id ;
	}
	public List < OrderItem > getItems ( )
	{
		return items ;
	}
	public void setItems ( List < OrderItem > items )
	{
		this.items = items ;
	}
	public Date getDate ( )
	{
		return date ;
	}
	public void setDate ( Date date )
	{
		this.date = date ;
	}
	public Order ( int id , List < OrderItem > items , Date date )
	{
		super ( ) ;
		this.id = id ;
		this.items = items ;
		this.date = date ;
	}
	public Order ( )
	{
		super ( ) ;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode ( )
	{
		final int prime = 31 ;
		int result = 1 ;
		result = prime * result
				+ ( ( date == null ) ? 0 : date.hashCode ( ) ) ;
		result = prime * result + id ;
		result = prime * result
				+ ( ( items == null ) ? 0 : items.hashCode ( ) ) ;
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
		Order other = ( Order ) obj ;
		if ( date == null )
		{
			if ( other.date != null )
				return false ;
		} else if ( ! date.equals ( other.date ) )
			return false ;
		if ( id != other.id )
			return false ;
		if ( items == null )
		{
			if ( other.items != null )
				return false ;
		} else if ( ! items.equals ( other.items ) )
			return false ;
		return true ;
	}
	@Override
	public String toString ( )
	{
		return "Order [id=" + id + ", items=" + items + ", date="
				+ date + "]" ;
	}	
	
}
