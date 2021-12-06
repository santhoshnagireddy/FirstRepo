package Strings;
import java.util.ArrayList;
import java.util.List;

public class StringToInteger2 {

	public static void main(String[] args) {
		String str = "1 2 3 4 5 6 7 8 9 10";
		String[] str1 = str.split(" ");

		List al = new ArrayList();
		int size = str.length();
		int arr[] = new int[size];
		for (int i = 0; i < str1.length; i++) {

			arr[i] = Integer.valueOf(str1[i]);

			/* arr[i]=Integer.parseInt(str1[i]); */

			al.add(arr[i]);

		}
		System.out.print(al);

	}

}
// here Integer.parseInt and Integer.valueOf can be used to change String type

