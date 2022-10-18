package week.day1;

import com.sun.tools.javac.code.Type.ForAll;

public class StringReverse {

	public static void main(String[] args) {
		   String input = "gubendhiran" ;
	       
	        char[] charArray = input.toCharArray(); 
	  
	        for (int i = charArray.length - 1; i >= 0; i--) 
	            System.out.print(charArray[i]); 
	    } 
	

	}


