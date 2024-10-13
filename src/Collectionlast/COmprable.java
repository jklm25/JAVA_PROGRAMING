package Collectionlast;

import java.util.Collections;
import java.util.Vector;

class memo implements Comparable<memo>
{
	int id;
	int sal;
	String name;
	
      memo(int id,int sal,String name)
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
	
	
	public int compareTo(memo o)
	{
		return this.id-o.id;
	}
}

public class COmprable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v=new Vector();
		memo m[]=new memo[2];
		
		v.add(new memo(4,100,"kk"));    
		v.add(new memo(5,200,"Dj"));     
		v.add(new memo(1,300,"sk"));     
	
		Collections.sort(v);
		for(Object obj:v)
		{
			memo rm=(memo)obj;
			System.out.println(rm.getId()+"\t"+rm.getName()+"\t"+rm.getSal());
		}
		
		
		
		
		
	}

}
