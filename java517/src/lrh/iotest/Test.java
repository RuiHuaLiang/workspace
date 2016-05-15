package lrh.iotest ;

import java.io.BufferedInputStream ;
import java.io.BufferedOutputStream ;
import java.io.FileInputStream ;
import java.io.FileOutputStream ;
import java.io.IOException ;

public class Test
{
	public static void main ( String [ ] args ) throws IOException
	{
		FileInputStream fis = new FileInputStream (
				"/home/liangruihua/work/test/1.txt" ) ;
		BufferedInputStream bis = new BufferedInputStream ( fis ) ;

		FileOutputStream fos = new FileOutputStream (
				"/home/liangruihua/work/test/2.txt" ) ;
		BufferedOutputStream bos = new BufferedOutputStream ( fos ) ;

		while ( true )
		{
			byte [ ] b = new byte [ 100 ] ;
			int len = bis.read ( b ) ;
			if ( len == - 1 )
			{
				break ;
			}
			bos.write ( b ) ;
		}
		bis.close ( ) ;
		bos.close ( ) ;

	}
}
