package arrays;
import java.util.Arrays;
public class ThirdSmallesttNumberInAnArray {
   public static void main(String args[]){
      int array[] = {10, 100, 25, 63, 96, 57};
      int size = array.length;
      
    Arrays.sort(array);
      
	 System.out.println("sorted Array ::"+Arrays.toString(array)); 
      int max1 = array[2];
      System.out.println("3rd largest element is :"+max1);
   }
} 