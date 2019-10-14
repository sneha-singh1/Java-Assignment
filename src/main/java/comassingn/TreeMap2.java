//Write a Java program to copy a Tree Map content to another Tree Map.
package comassingn;

import java.util.*;

public class TreeMap2 {

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
		  TreeMap<Integer, String> tmap1= new TreeMap<Integer, String>(tmap);
	        tmap1.putAll(tmap);
	        for(Map.Entry<Integer, String> entry: tmap1.entrySet()){
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }

}
}
