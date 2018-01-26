// program to Reverse a String

package com.wallmartassignment;
	// converting string to characters one by one
	import java.util.*;
	 
	// Class of ReverseString
	public class ReverseString
	{
		 private static Scanner inputString;
		 
		// convert String to character array
        // by using toCharArray
        public void  getReveseString(String input)
        {
			char[] try1 = input.toCharArray();
	        for (int i = try1.length-1; i>=0; i--){
	            System.out.print(try1[i]);
	        }
	       
		}
		
        public static void main(String[] args)
	    {
	    	inputString = new Scanner(System.in);
	        String input = inputString.nextLine();
	        ReverseString reverseString=new ReverseString();
	        reverseString.getReveseString(input);
	        inputString.close();
	    }
        
		
	}


	
