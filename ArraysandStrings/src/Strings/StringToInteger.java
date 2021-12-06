package Strings;
import java.util.ArrayList;
import java.util.List;

public class StringToInteger {

	public static void main(String[] args) {
		String[] str = { "123", "345", "437", "894", "12" };

		int size = str.length;
		List al=new ArrayList();
		int arr[] = new int[size];
		for (int i = 0; i < str.length; i++) {
			
		/* arr[i]=Integer.valueOf(str[i]); */
			
		arr[i] = Integer.parseInt(str[i]);
		al.add(arr[i]);

			

		}
		System.out.println(al);

	}

}
// here Integer.parseInt and Integer.valueOf can be used to change String type
// to Integer type
