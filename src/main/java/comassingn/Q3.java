//Write a Java program to search an element in a array list.
package comassingn;
import java.util.*;

public class Q3 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> a = new ArrayList<String>();
			a.add("a");
			a.add("b");
			a.add("c");
			a.add("d");
			a.add("Blue");
			a.add("Yellow");
			a.add("Orange");
			a.add("Green");	
			a.add("Violet");
			s = new Scanner(System.in);
			System.out.println("Enter colour name to search.");
			if(a.contains(s.next()))
				System.out.println("Element found");
			else
				System.out.println("Element not found");
	}

}
	
