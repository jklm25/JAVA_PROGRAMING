package Collectionlast;

import java.util.Collections;
import java.util.Vector;

class empl  {
    int id;
    String name;
    int sal;

    empl(int id, int sal, String name) {
        this.id = id;
        this.sal = sal;
        this.name = name;
    }

    // Getters and Setters
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

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    // Override toString() method
    @Override
    
    
    
    public String toString() 
    {
    	
    	System.out.println(id+"\t"+sal+"\t"+name);
        return"";
    }


//	public int compareTo(empl o)
//	{
//	     return this.id-o.id;
//	}
}

public class CollecctionsObject {

    public static void main(String[] args) {

    	empl em[]=new empl[3];
    	
        Vector v = new Vector();

        // Adding empl objects to Vector
        v.add(new empl(1, 12, "kk"));
        v.add(new empl(3, 33, "ff"));
        v.add(new empl(2, 44, "cd"));

    //    Collections.sort(v);
        System.out.println(v);
    }
}
