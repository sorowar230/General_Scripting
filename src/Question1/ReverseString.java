package Question1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner( System.in );
		 System.out.print( "Type your string: " );
		 String userinput = scanner.nextLine();
		 System.out.println(reverseEverything(userinput));  
	}
	
	public static String reverseEverything(String s) {
		char chr[]=s.toCharArray();  
	    String revstr="";  
	    for(int i=chr.length-1;i>=0;i--){  
	    	revstr+=chr[i];  
	    }  
		return revstr;
		
	}

}
