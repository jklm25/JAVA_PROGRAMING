package Collectionlast;

public class sdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]=new int[]{2,7,2,5,4};
		
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;i++)
			{
				if(a[i]+a[j]==9)
				{
					System.out.println(a[i]+"\t"+a[j]);
				}
			}
		}
		
	}

}
