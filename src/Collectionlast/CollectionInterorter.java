package Collectionlast;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class CollectionInterorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v=new Vector();
		
		v.add(12);
		v.add(23);
		v.add(200);
		v.add(2234);
		v.add(12334);
		
		
		Enumeration e=v.elements();
		System.out.println("this is enumration method");
		while(e.hasMoreElements())
		{
			Object obj=e.nextElement();
			
			System.out.println(obj);
		}
		
		System.out.println("this is itoretor method ");
		
		Iterator i=v.iterator();
		
		
	   
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		
		System.out.println("this is listIterator forward direction");
		
		
		ListIterator ls=v.listIterator();
		
		
		while(ls.hasNext())
		{
			Object obj=ls.next();
			
			System.out.println(obj);
		}
		
		
		System.out.println("this si ListIterator backword direction");
		
		
		
		ListIterator lt=v.listIterator(v.size());
		while(lt.hasPrevious())
		{
			Object obj=lt.previous();
			
			
			
			System.out.println(obj);
		}
		
		System.out.println("after jdk 1.5");
		
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		
		System.out.println("after jdk 1.8");
	
		
		v.forEach(vl->System.out.println(vl));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
