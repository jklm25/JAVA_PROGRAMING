package Collectionlast;

public class ArrayListsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]=new int[]{12,33,40,54,5,6,66};
		
		int f=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=100)
			{
				System.out.println(a[i]);
				f=1;
				
				
				
			}
					}
		
		if(f==0)
		{
			System.out.println("no any");
		}
		
	}

}
