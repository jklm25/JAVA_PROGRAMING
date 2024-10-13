package Collectionlast;

import java.util.ArrayList;
import java.util.Iterator;

public class kkl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al =new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		
		System.out.println(al);
		
		boolean b=al.contains(200);
		
		if(b)
		{
			System.out.println("elements is present ");
			
           Iterator i=al.iterator();
			
			while(i.hasNext())
			{
				Object obj=i.next();
				
				if((int)obj==200)
				{
					i.remove();
				}
			}
			
		
		}
		
		System.out.println(al);

	}

}
