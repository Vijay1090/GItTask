package Logical_Programs;

import java.util.Scanner;

public class NumberReverse_Palindrom {
	public static void main(String [] args ) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number whose reverse you want :");
		
	    long	num=scan.nextInt();
	    long rev=0;
	    long rem=0;
	    
	    for(long i=num;i>0;i=i/10) {  // i=12345;i>=
	    	
	    	rem=i%10;
	    	System.out.println(rem);
	        rev=10*rev+rem;
	    	
	    }
	    System.out.println(rev);
	    if(rev==num) {
	    	System.out.println("Given number is palindrom");
	    }
	    else {
	    	System.out.println("Given Number is not palindrom");
	    }
	
	
	}

}
