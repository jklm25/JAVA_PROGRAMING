package Collectionlast;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class memos
{
	int id;
	int sal;
	String name;
	
      memos(int id,int sal,String name)
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

class id implements Comparator<memos>
{
	public int compare(memos o,memos o2)
	{
		return o.id-o2.id;
	}

	
	
}

class sal implements Comparator<memos>
{
	public int compare(memos o,memos o2)
	{
		return o.getSal()-o2.getSal();
	}
}

class name implements Comparator<memos>
{
	public int compare(memos o,memos o2)
	{
		return o.getName().compareTo(o2.getName());
	}
}
public class ComparatorInterble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		do
		{
			Vector v=new Vector();
			memos m[]=new memos[2];
			
			v.add(new memos(4,100,"kk"));    
			v.add(new memos(5,200,"Dj"));     
			v.add(new memos(1,300,"sk"));     
		
			
			System.out.println("enter the coice \n 1 for sort by id \n 2 for sort by sal \n 3 for sort by name ");
			Scanner kk=new Scanner(System.in);
			
			int c=kk.nextInt();
		
		switch(c)
		{
		case 1:
			Collections.sort(v,new id());
			for(Object obj:v)
			{
				memos rm=(memos)obj;
				System.out.println(rm.getId()+"\t"+rm.getName()+"\t"+rm.getSal());
			}
			break;
		case 2:
			Collections.sort(v,new sal());
			for(Object obj:v)
			{
				memos rm=(memos)obj;
				System.out.println(rm.getId()+"\t"+rm.getName()+"\t"+rm.getSal());
			}
			break;
		case 3:
			Collections.sort(v,new name());
			for(Object obj:v)
			{
				memos rm=(memos)obj;
				System.out.println(rm.getId()+"\t"+rm.getName()+"\t"+rm.getSal());
			}
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Wrong Choice");
		}
 
		}while(true);
				
		
	}

}
