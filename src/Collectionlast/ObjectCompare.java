package Collectionlast;

class shankar
{
	int no;
	void setd(int x)
	{
		no=x;
	}
	
	public boolean equals(Object o)
	{
		shankar d=(shankar)o;
		if(this.no==d.no)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		return no;
		
	}
}

public class ObjectCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shankar k=new shankar();
		shankar k1=new shankar();
		
	        k.setd(12);
	        k1.setd(12);
	        
	        if(k.equals(k1))
	        {
	        	System.out.println("equal");
	        	System.out.println(k.hashCode());
	            System.out.println(k1.hashCode());
	        }
	        else
	        {
	        	System.out.println("not eqaul");
	        }

	        
	        
	        int m=100;
	        int n=100;

	        if(m==n)
	        {
	        	
	        }
	}

}
