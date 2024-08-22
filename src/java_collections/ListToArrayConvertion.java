/* 4) Write a program to convert List to Array */

package java_collections;

import java.util.LinkedList;
import java.util.List;

public class ListToArrayConvertion {

	public static void main(String[] args) {
		
		//Creating LinkedList of type String
		
		List<String> ref = new LinkedList<String>();
		
		//Adding elements to the list
		
		ref.add("Mathematics");
		ref.add("English");
		ref.add("Computer Science");
		ref.add("Tamil");
		ref.add("Science");
		
		//printing the list
		System.out.println("The List of subjects : " +ref +"\n");
		
		//Extracting the length of the list
		int length = ref.size();
		
		//Declaring and initializing an array of type String with array size as the list-length 
		String array[]= new String[length];
		
		//Converting the list to array using get() method 
		for(int i=0;i<length;i++)
		{
			array[i]=ref.get(i);
		}
		
		//printing the array
		System.out.println("The Array of subjects : ");
		
		for(String str : array)
		{
			System.out.println(str + "\n");
		}

	}

}


/* Output :
 
 The List of subjects : [Mathematics, English, Computer Science, Tamil, Science]

The Array of subjects : 
Mathematics

English

Computer Science

Tamil

Science

*/
