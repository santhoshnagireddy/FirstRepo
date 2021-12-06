package Strings;

public class ReverseOrder {
  
	    public static void main(String[] args) {  
	        //Initialize array 
	    	
	        String str="santhosh";
	        
	        char ch[]=str.toCharArray();

 
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = str.length()-1; i >= 0; i--) {  
	            System.out.print(ch[i] + " ");  
	        }  
	    }  
	}  


