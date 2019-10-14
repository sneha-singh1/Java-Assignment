//Write a Java program to compare two array lists.
package comassingn;

import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1 = new ArrayList<String>();
		a1.add("a");
		a1.add("B");
		a1.add("Orange");
		a1.add("Green");	
		a1.add("Violet");
		
		List<String> a2 = new ArrayList<String>();
		a2.add("d");
		a2.add("Blue");
		a2.add("Yellow");
		a2.add("Orange");
		a2.add("Green");	
		a2.add("Violet");
		
		List<String> a3 = new ArrayList<String>();
		a3.add("a");
		a3.add("B");
		a3.add("c");
		a3.add("Orange");
		a3.add("Green");	
		a3.add("Violet");
		System.out.println("First List: "+a1);
		System.out.println("Second List: "+a2 );
		System.out.println("Third List: "+a3);
		
		for(String e: a1) {
			if(a2.contains(e))
				a3.add(e);
		}
		System.out.println("Common Elements List: "+a3);
	}

}
