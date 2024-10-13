package Collectionlast;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class data
{
	int id;
	int sal;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		data d[]=new data[2];
		
		Vector v=new Vector();
		
		
		int id;
		int sal;
	   String name;
	   
	   Scanner kk=new Scanner(System.in);
	   
	   
	   for(int i=0;i<d.length;i++)
	   {
		   d[i]=new data();
		   
		   System.out.println("enter the id sal and name");
		   
		   
		   
		   id=kk.nextInt();
		   sal=kk.nextInt();
		   name=kk.next();
		   
		   d[i].setId(id);
		   d[i].setSal(sal);
		   d[i].setName(name);
		   
		   v.add(d[i]);
		   
	   }
		
		Iterator i=v.iterator();
		int max=0;
		int f=0;
		while(i.hasNext())
		{
			Object obj=i.next();
			
			data t=(data)obj;
			
			int total=t.getId()*t.getSal();
			
			if(total>=100)
			{
				System.out.println(t.getId()+"\t"+t.getSal()+"\t"+t.getName()+"\t"+total);
				f=1;
			}
						
			
		}
		
		if(f==0)
		{
			System.out.println("no any");
		}
		

	}

}
