package Logical_Programs;

import java.util.Scanner;

public class String_Reverse_Palindrom {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String value :");

		String	name=scan.next();
		String rev="";

		for(int i=name.length()-1;i>=0;i--) {

			char ch=name.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(rev.equals(name)) {
			System.out.println("Given String is Palindrom");
		}
		else {
			System.out.println("Given String is not palindrom");
		}

	}

}
