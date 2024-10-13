package Collectionlast;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

class employee
{

	int sal;
	int id;
	String name;
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Collectionarrayofobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		employee emp[]=new employee[3];
		
		Scanner kk=new Scanner(System.in);
		
		int sal;
		int id;
		String name;
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new employee();
			System.out.println("enter the id name sal ");
			id=kk.nextInt();
			sal=kk.nextInt();
			name=kk.next();
			emp[i].setId(id);
			emp[i].setSal(sal);
			emp[i].setName(name);
			
			v.add(emp[i]);
			
		}
		
		
		
		
		Enumeration e=v.elements();
		
	
		while(e.hasMoreElements())
		{
			Object obj=e.nextElement();
			
			employee em=(employee)obj;
			
			System.out.println(em.getId()+"\t"+em.getSal()+"\t"+em.getName());
		}

	}

}
