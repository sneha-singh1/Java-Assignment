//Write a Java program to search a key and value in a Tree Map.
package comassingn;

import java.util.*;

public class TreeMap3 {

	private static Scanner s;

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
	        s = new Scanner(System.in);
	        System.out.println("Enter the element:" +tmap);
	        int a= s.nextInt();
	        if(tmap.containsKey(a)){
	            System.out.println("Present");
	        }else{
	            System.out.println("Not Present");
	        }
	}

}
