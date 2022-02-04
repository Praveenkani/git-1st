package org.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayClass {
	
	public static void main(String[] args) {
		
	
	String s= "praveenkumar";

			Map<Character,Integer> name = new LinkedHashMap<>();

			for (int i=s.length()-1; i>=0; i--){
			//System.out.println(i);  

			char c =s.charAt(i);  
			System.out.println(c);

			if(name.containsKey(c)){  

			int value =name.get(c);

			name.put(c,value+1);
			}

			else{

			name.put(c,1);
			}
			}
			System.out.println(name);

			
			}}
 