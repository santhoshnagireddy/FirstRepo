package Strings;

import java.io.*;
import java.util.Arrays;

public class StringtoArray3
{
	public static void main(String[] args)
	{
		
		String str = "[1,2,356,678,3378]";
		
		int size=str.length();
		System.out.println(size);
		
		
		String string[]=str.substring(1,str.length()-1).split(",");
		
		int size1=string.length;
		System.out.println(size1);
		
		
		int[] arr = new int[string.length];
		
		for (int i = 0; i < string.length; i++)
		{
			arr[i] = Integer.valueOf(string[i]);
		}
		
		
		
		System.out.print("Integer array : " + Arrays.toString(arr));
	}
}
