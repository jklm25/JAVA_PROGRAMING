	package Collectionlast;

import java.util.Collections;
import java.util.Vector;



class emp
{
	int id;
	int sal;
	String name;
	
	
	emp(int id,int sal,String name)
	{
		this.id=id;
		this.sal=sal;
		this.name=name;
	}
	
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

public class objectcloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector  v=new Vector();
		emp e[]=new emp[3];
		
		v.add(new emp(3,10,"kk"));
		v.add(new emp(2,20,"dk"));
		v.add(new emp(1,300,"sk"));
		
		
		
	  for(Object obj:v)
	  {
		  emp em=(emp)obj;
		  
		  System.out.println(em.getId()+"\t"+em.getSal()+"\t"+em.getName());
	  }
			    
	    
	}

}
