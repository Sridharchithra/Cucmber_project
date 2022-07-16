package com.Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repititive {

	public static void main(String[] args) {
		String s="Hi Good Morning";
		String[] split = s.split(" ");
		int length = split.length;
		  System.out.println(length);
	String[] allwords=s.split(" ");
	//	for (String s1 : allwords) {
	//		System.out.println(s1);
	//	}
		Map< String,Integer> m=new LinkedHashMap< String ,Integer>();
		for (String words : allwords) {
			if(m.containsKey(words)) {
				Integer value = m.get(words);
				System.out.println(value);
				m.put(words, value+1);
			}else {
				m.put(words,1);
			}
			
		}
		
		  System.out.println(m); 
		
	/*	for (String words : allwords){
			Integer value = m.get(words); //get integer  value
			System.out.println(value);
			if(value==null) {
				value=0;
			}
			m.put(words, value+1);
			//System.out.println(s.length());
        // String[] allwords= {"api" ,"testing","functional" ,"testing","performance","testing"};
		//int i = allwords.length;
		//System.out.println(i);
		
		}
          System.out.println(m); */
				
		
		 Set<Entry<String, Integer>> entrySet = m.entrySet();
		 for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}

}
