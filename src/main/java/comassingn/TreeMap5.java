package comassingn;

import java.util.*;

public class TreeMap5 {

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
	        System.out.println("Original List: " +tmap);
			s = new Scanner(System.in);
			
			
			//Write a Java program to get a reverse order view of the keys contained in a given map.
			System.out.println("The reverse tree is "+tmap.descendingKeySet());
			
			
			//Write a Java program to get the portion of a map whose keys are strictly less than a given key.
			System.out.println("Enter Key to check for smaller keys");
			int k = s.nextInt();
			System.out.println("The element with keys smaller than "+k+" are "+tmap.headMap(k));
	     
			
	        // Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
			System.out.println("Enter lower key limit");
			int lk = s.nextInt();
			System.out.println("Enter upper key limit");
			int uk = s.nextInt();
			System.out.println("The element with keys ranging between "+lk+" and "+uk+" are "+tmap.subMap(lk, uk));
	}

}
