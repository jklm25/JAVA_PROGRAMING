package Collectionlast;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class room 
{
	int id;
	int sal;
	String name;
	
	room(int id,int sal,String name)
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
	class dd implements Comparator<room>
	{

		@Override
		public int compare(room o1, room o2) {
			// TODO Auto-generated method stub
			return o1.getId()-o2.getId();
		}
		
	
	
	
	
	
	
	
	
}
public class COMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		
		room r[]=new room[3];
  
		dd d=new dd();
		
		v.add(r[0]=new room(2,10,"kk"));
		v.add(r[1]=new room(1,12,"dk"));
		v.add(r[2]=new room(3,13,"ssd"));
		
		
		Collections.sort(v,d);
		
	 for(Object obj:v)
	 {
		 room rm=(room)obj;
		 
		 System.out.println(rm.getId()+"\t"+rm.getName()+"\t"+rm.getSal());
	 }

	}

}
