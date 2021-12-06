package arrays;
public class SortAsc {   

    
    public static void main(String[] args) {   
    	
           
        int [] arr =  {5, 9, 8, 7, 1};     
        int temp,size;
        size=arr.length;
       
            
        
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];   
                   arr[j] = temp;    
               }     
            }     
        }    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }  
        
    }    
}    