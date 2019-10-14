//Write a Java program to retrieve an element (at a specified index) from a given array list.
package comassingn;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("Blue");
		a.add("Yellow");
		a.add("Orange");
		a.add("Green");
		a.add("Green");	
		
		System.out.println("print string:" +a);
		String e1 = a.get(0);
		System.out.println("First Element:" +e1);
		String e2 = a.get(3);
		System.out.println("fouth element:" +e2);
	}

}
