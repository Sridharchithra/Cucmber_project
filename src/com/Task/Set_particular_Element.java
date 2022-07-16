package com.Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_particular_Element {

public void settolist() {
	 



			// Declare HashSet using Set Interface
			Set<String> GFG = new HashSet<String>();

			// Add elements into HashSet using add()
			GFG.add("Welcome");
			GFG.add("To");
			GFG.add("Geeks");
			GFG.add("For");
			GFG.add("Geek");

			// Displaying HashSet
			System.out.println("HashSet contains: " + GFG);

			// Notice the order of elements may be different
			// than insertion

			// Converting HashSet to ArrayList
			List<String> list = new ArrayList<String>(GFG);

			System.out.println("Element at index 3 is: "
							+ list.get(3));
		
	}

	public static void main(String[] args) {
		// Java Program to get HashSet elements by index using Array

		 Set_particular_Element o=new  Set_particular_Element();
		 o.settolist();
				// Declare HashSet using Set Interface
				Set<String> GFG = new LinkedHashSet<String>();

				// Add elements into HashSet using add()
				GFG.add("Welcome");
				GFG.add("To");
				GFG.add("Geeks");
				GFG.add("For");
				GFG.add("Geek");

				// Displaying HashSet
				System.out.println("HashSet contains: " + GFG);

		

				// Converting HashSet to Array
				String[] Geeks = GFG.toArray(new String[GFG.size()]);

				// Accessing elements by index
				System.out.println("Element at index 3 is: "
								+ Geeks[3]);
			}
		


	}


