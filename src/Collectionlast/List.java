package Collectionlast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class List {

	public static void main(String[] args) {
		
		int a[]=new int[] {10,10,10,10,20,20,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		ArrayList al=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		TreeSet hs=new TreeSet(al);
		System.out.println(hs);
		
		ArrayList pl=new ArrayList(hs);
		int b[]=new int[hs.size()];
		for(int i=0;i<b.length;i++)
		{
		     b[i]=(int)pl.get(i);
		}
		
		System.out.println("After Removing Duplicate Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
