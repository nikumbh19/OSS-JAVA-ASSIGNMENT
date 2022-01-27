/*Q4. Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
array. The method's signature is as follows:
*/

package com.day1.question4;

import java.util.Arrays;

public class Question4 {
	public static void main(String[] args) {
		
		int[] original = new int[] {10, 11, 67};
	     
	      System.out.println("Original Array : ");
	      for (int i = 0; i < original.length; i++)
	           System.out.print(original[i] + " ");  
	        
	      int[] copy = Arrays.copyOf(original, original.length);
		    
	       System.out.println("New array copy");
	       for (int i = 0; i < copy.length; i++) 
	           System.out.print(copy[i] + " ");
	       
	}
	

}
