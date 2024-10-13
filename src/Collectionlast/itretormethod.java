package Collectionlast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class itretormethod {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		
//	     boolean b=al.isEmpty();
//	     
//	     if(b)
//	     {
//	    	 System.out.println("array is emty");
//	     }
//	     else
//	     {
//	    	 System.out.println("array have value");
//	     }
		
//		al.add(200);
//		
//		boolean b=al.contains(200);
//		
//		if(b)
//		{
//			System.out.println("value is found ");
//		}
//		else
//		{
//			System.out.println("value is not found ");
//		}
		
//		al.add(200);
//		al.add(990);
//		
//		
//		int d=al.indexOf(200);
//		
//		al.remove(d);
//		boolean b=al.contains(200);
//		if(b)
//		{
//			System.out.println("value remove");
//		}
//		else
//		{
//			System.out.println("not");
//		}
		
		Vector v=new Vector(5);
		
		
		System.out.println(v.capacity());
		
		
		v.add(1233);
		v.add(1233);
		v.add(1233);
		v.add(1233);
		v.add(1233);
		v.add(1233);
		
		
		System.out.println(v.capacity());
		
		System.out.println(v);
		
		Iterator i=v.iterator();
		
		
		while(i.hasNext())
		{
			Object obj=i.next();
			
			System.out.println(obj);
		}
		
		
		
		
		
		
		

	}

}
