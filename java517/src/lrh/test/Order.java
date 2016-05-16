package lrh.test;

import java.io.Serializable ;
import java.util.Date ;
import java.util.List ;

public class Order implements Serializable
{
	private int id;
	private List<OrderItem> items;
	private Date date;
	private double total;
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
	public double getTotal ( )
	{
		return total ;
	}
	public void setTotal ( double total )
	{
		this.total = total ;
	}
	
	
	public Order ( int id , List < OrderItem > items , Date date ,
			double total )
	{
		super ( ) ;
		this.id = id ;
		this.items = items ;
		this.date = date ;
		this.total = total ;
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
		long temp ;
		temp = Double.doubleToLongBits ( total ) ;
		result = prime * result + ( int ) ( temp ^ ( temp >>> 32 ) ) ;
		return result ;
	}
	@Override
	public boolean equals ( Object obj )
	{
		if(obj instanceof Order)
		{
			if(this.id == ((Order)obj).getId ( ))
			{
				return true;
			}
		}
		return false ;
	}
	@Override
	public String toString ( )
	{
		return "Order [id=" + id + ", items=" + items + ", date="
				+ date + ", total=" + total + "]" ;
	}
	
	
	
}
