
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pascal {
	
	public static void main(String args[]){  
		for(int i=0;i<5;i++) {
			
			//spaces
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			//numberds
			int number=1;
			for(int k=0;k<=i;k++) {
				
				System.out.print(number+" ");
				 number =number*(i-k)/(k+1); 
				
			}
			System.out.println();
		}
	}
}
