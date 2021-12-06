package Strings;

import java.util.HashSet;
import java.util.Set;

public class Duplicatestring {
	
		 public static void main(String argu[]) {

		  String str = "santhosh";
		  Set s=new HashSet();
		  
			 char ch[] = str.toCharArray(); 
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if ( ch[i] == ch[j]) {
		     System.out.println(ch[i]);
		    }
		   }
		  }
		 }
		}


