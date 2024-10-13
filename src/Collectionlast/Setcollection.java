package Collectionlast;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Setcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		
		
		hs.add(12);
	     hs.add(313);
	     hs.add(33);
	     hs.add(333);
	     hs.add(12);
	     
	     System.out.println(hs);
	     
	     
	     LinkedHashSet ls=new LinkedHashSet();
	     
	     ls.add(12);
	     ls.add(123);
	     ls.add(43);
	     ls.add(334);
	     ls.add(2234);
	    ls.add(12);
	    
	    
	    
	    System.out.println(ls);
	    
	    
	    TreeSet ts=new TreeSet();
	    
	    ts.add(23);
	    ts.add(33);
	    ts.add(223);
	    ts.add(1);
	    
	    
	    System.out.println("ts is "+ts);
	    
	    NavigableSet ns=ts.descendingSet();
	    
	    System.out.println("ns is "+ns);
	     

	}

}
