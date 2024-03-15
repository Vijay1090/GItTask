package Logical_Programs;

import java.util.Scanner;

public class SwappingString {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter frist String value :");
		String str1=scan.next();
		System.out.println("Enter Second String value :");
		String str2=scan.next();
		
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length(), str1.length());
		
		System.out.println("Value of str1 after swapping :"+str1);
		System.out.println("Value of str2 after swapping  :"+str2);
		
	}

}
