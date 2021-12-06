package arrays;
import java.util.Arrays;
public class ThirdLargestNumberInAnArray {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 96, 57};
      
    Arrays.sort(array);
    int size = array.length;
    
      
	 System.out.println("sorted Array ::"+Arrays.toString(array)); 
      int max1 = array[size-3];
      System.out.println("3rd largest element is :"+max1);
   }
} 