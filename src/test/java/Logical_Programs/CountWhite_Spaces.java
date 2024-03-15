package Logical_Programs;

import java.util.Scanner;

public class CountWhite_Spaces {

	  public static void main(String args[]) {
		  Scanner scan=new Scanner(System.in);
		 int count=0;
		  System.out.println("Enter Line of String");
		  
		  String org=scan.nextLine();
		  for(int i=0;i<=org.length()-1;i++) {
			  char ch=org.charAt(i);
			 
			  if(ch==' ') {
				  count++;
				  
			  }
			  
		  }
		  System.out.println(count);
		  
	  }
}
