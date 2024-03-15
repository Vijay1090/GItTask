package Logical_Programs;

import java.util.Scanner;

public class String_Vowels {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String Value :");
	String	org=scan.nextLine();
	String allVowels="";
	
 String	str=org.toLowerCase();
	int totalvowels=0;
	
	for(int i=0;i<=str.length()-1;i++) {
		
	char	ch=org.charAt(i);
	if(ch=='a'|| ch=='e' || ch=='i' ||ch=='o' || ch=='u') {
		
		totalvowels++;
		allVowels=allVowels+ch;
		
	}
	
	}
	System.out.println("Total vowels are :"+totalvowels);
	System.out.println("That vowels are :"+allVowels);
	
	}

}
