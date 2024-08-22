/* 2) Write a Java program to create an ArrayList of strings and then remove all the elements
   from the ArrayList
 */

package java_collections;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		//creating array list of type String
		
		ArrayList<String> list = new ArrayList<>();
		
		//adding elements to the list
		
		list.add("Java");
		list.add("Python");
		list.add("C#");
		list.add("Ruby");
		list.add("JavaScript");
		
		//printing the list before removing elements
		System.out.println("ArrayList before removing the elements : " +list);
		
		//to remove all the elements from the list
		list.clear();
		
		//printing the list after removing every elements
		System.out.println("ArrayList after removing all the elements : " +list);

	}

}

/* Output :
 
ArrayList before removing the elements : [Java, Python, C#, Ruby, JavaScript]
ArrayList after removing all the elements : []

 */
