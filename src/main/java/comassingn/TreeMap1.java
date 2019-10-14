//Write a Java program to associate the specified value with the specified key in a Tree Map.
package comassingn;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> tmap=new TreeMap<Integer, String>();
	        tmap.put(1, "a");
	        tmap.put(2, "B");
	        tmap.put(3, "c");
	        tmap.put(4, "d");
	        tmap.put(5, "Orange");
	        tmap.put(6, "green");
	        tmap.put(7, "Blue");
	        tmap.put(8, "Yellow");

	        for (Map.Entry<Integer,String> entry : tmap.entrySet())
	        {
	            System.out.println(entry.getKey() + ":" + entry.getValue());
	        }
	}

}
