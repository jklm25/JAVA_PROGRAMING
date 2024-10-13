package Collectionlast;

class demo
{
	int id;
	
	void setdata(int id)
	{
		this.id=id;
	}
	
	public boolean equals(Object obj)
	{
		demo d2=(demo)obj;
		
		if(this.id==d2.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Collectionsequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo d=new demo();
		demo d1=new demo();
		d.setdata(12);
		d1.setdata(12);
		
		
		System.out.println(d.hashCode());
		
		System.out.println(d1.hashCode());
		if(d.equals(d1))
		{
			System.out.println("this is equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
