package com.Task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repeat_Char_String {
	public static void main(String[] args) {
		String s="sridhaaar";
		char[] allwords= s.toCharArray();
	
	Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
	for (char words : allwords) {
		if(m.containsKey(words)) {
			Integer value = m.get(words);
			m.put(words, value+1);
		}else {
			m.put(words,1);
		}
		
	}
	
	//  System.out.println(m); 
		 Set<Entry<Character, Integer>> entrySet = m.entrySet();
		 for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate:"+entry);
			}
		}

}}
