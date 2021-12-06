package arrays;

public class Minarray {
	
	    public static void main(String[] args) {  
	  
	        //Initialize array  
	        int [] arr =  {25, 11, 7, 75, 56};  
	        //Initialize max with first element of array.  
	        int min = arr[0];  
	        //Loop through the array  
	       /* for (int i = 0; i < arr.length; i++) {*/  
	        
	                for(int i:arr) {
	             
	           if(i < min)  
	               min = i;  
	        }  
	        System.out.println("Largest element present in given array: " + min);  
	    }  
	}  


                                                                       