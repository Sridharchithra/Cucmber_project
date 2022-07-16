package com.Task;

import java.util.LinkedHashSet;
import java.util.Set;

public class CFG {
	// Java Program to get elements of HashSet by index using a
	// for loop

	
		public static void main(String[] args)
		{

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

			// Notice the order of elements may be different
			// than insertion

			// Iterator declaration
			int currentIndex = 0;

			// Desired Index
			int desiredIndex = 2;
			
			for (String element :GFG) {
			// Implementing for loop

				if (currentIndex == desiredIndex)
				{
					System.out.println("Element at index 3 is: "+ element);
					break;
				}
				currentIndex++;
			}
		}
	}


