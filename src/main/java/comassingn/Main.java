//Write a Java program to insert an element into the array list at the first position.
package comassingn;
import java.util.*;

public class Main {
	public static class Array1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		System.out.println("list is:" + a);
		a.add("Sneha");
		a.add("Aayush");
		System.out.println("adding the elemnet at first position:" +a);
		a.add(0,"Hello");
		System.out.println("After adding , new list is:" + a);
	}
	}
}
