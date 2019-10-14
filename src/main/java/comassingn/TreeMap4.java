//Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
package comassingn;

import java.util.*;

public class TreeMap4 {

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
	        System.out.println("Original List: " +tmap);
	        
	        System.out.println(tmap.firstEntry());
	        System.out.println(tmap.lastEntry());
}
}
