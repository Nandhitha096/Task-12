/* 3) Write a Java program to create a TreeMap of employee ID's and names. Then, print out
   the names of all the employees in alphabetical order.
 */

package java_collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapProgram {

		// Method for sorting the TreeMap based on values 
	
		public static <Key, Value extends Comparable<Value> > Map<Key, Value> sorting(final Map<Key, Value> map) 
		{ 
			// Static Method with return type Map and extending comparator class which compares values associated with two keys 
			Comparator<Key> valueComparator = new Comparator<Key>() 
			{ 			
				//Method to compare keys
				public int compare(Key k1, Key k2) 
				{ 
					int comparekeys = map.get(k1).compareTo(map.get(k2)); 
					if (comparekeys == 0) 
						return 1; 
					else
						return comparekeys; 
				} 
			};
			
			
			// SortedMap created using the comparator 
			Map<Key, Value> sortedValue = new TreeMap<Key, Value>(valueComparator); 
			sortedValue.putAll(map); 
			return sortedValue; 
		} 

	
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> emp = new TreeMap<>();
		emp.put(100, "Menaka");
		emp.put(101, "Limson");
		emp.put(102, "Alice");
		emp.put(103, "Venilla");
		emp.put(104, "Sindhu");
		
		System.out.println(emp +"\n");
		
		
		System.out.println("The Employee names before Sorting : \n");
			
		for(String name : emp.values())
		{
			System.out.println(name);
		}
		
		// Calling the sorting method 
		Map<Integer, String> sortedMap = sorting(emp); 

		// Get a set of the entries on the sorted map 
		Set<Entry<Integer, String>> set = sortedMap.entrySet(); 

		// Get an iterator 
		Iterator<Entry<Integer, String>> iterator = set.iterator(); 

		System.out.println("The Employee names after Sorting : \n" );
		
		//Printing the names post sorting
		while (iterator.hasNext()) 
		{ 
			Map.Entry<Integer, String> value = (Map.Entry<Integer, String>)iterator.next(); 
			System.out.println( value.getValue()); 
		} 

		
		}
	}


/*  OUTPUT :
 
 {100=Menaka, 101=Limson, 102=Alice, 103=Venilla, 104=Sindhu}

The Employee names before Sorting : 

Menaka
Limson
Alice
Venilla
Sindhu
The Employee names after Sorting : 

Alice
Limson
Menaka
Sindhu
Venilla

 */


