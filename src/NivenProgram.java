import java.util.Scanner;

public class NivenProgram {

	public static void main(String[] args) {
		{
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter any num");
			 int num=sc.nextInt();
		        
		        int rem = 0, sum = 0, temp;  
		          
		        temp=num;
		         
		        while(num > 0){  
		            rem = num%10;  
		            sum = sum + rem;  
		            num = num/10;  
		        }  
		          
		        
		        if(temp%sum==0)  
		            System.out.println(temp + " is a harshad number");  
		        else  
		            System.out.println(temp + " is not a harshad number");  
		    }  
		}
}