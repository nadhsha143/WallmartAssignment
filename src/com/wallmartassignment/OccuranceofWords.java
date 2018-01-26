package com.wallmartassignment;

import java.util.*;
import java.util.Map.Entry;

public class OccuranceofWords {
		public void countWords(String input) {
        Map <String, String> map = new HashMap <String, String> ();
 
        if (input != null) {
            String[] separatedWords = input.split(" ");
            for (String str: separatedWords) {
                if (map.containsKey(str)) {
                    int count = Integer.parseInt(map.get(str));
                    map.put(str, String.valueOf(count + 1));
                } else {
                    map.put(str, "1");
                }
            }
        }
        System.out.print("[");
        for(Entry<String, String> entry : map.entrySet())
        {   //print keys and values
             System.out.print("{"+'"'+entry.getKey()+'"' + " : " +entry.getValue()+"}"+",");
        }
        System.out.print("]");
    }

	
	
	public static void main(String[] args) {
	String countWords="Walmart Technology is reinventing the way the world shops and we’ve only just begun. Our team includes @Walmart Labs in Silicon"
	 		+ "Valley and Bengaluru, which powers the eCommerce experience, as well as technology teams across data and analytics, retail, back office and more who"
	 		+ "help power store and digital experiences.";
	
		
		OccuranceofWords occuranceofWords=new OccuranceofWords();
		occuranceofWords.countWords(countWords);
		 	    
}
}
