package Logical_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalVowelsMethod2 {
	public static void main(String [] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String Value :");
	String	org=scan.nextLine();
	String allVowels="";
	int countvowels=0;
	
 String	str=org.toLowerCase();
 
 
  List l=new ArrayList();
  l.add('a');
  l.add('e');
  l.add('i');
  l.add('o');
  l.add('u');
	
	for(int i=0;i<=str.length()-1;i++) {
		
	char ch=str.charAt(i);
	if(l.contains(ch)) {
		countvowels++;
		allVowels=allVowels+ch;
		
	}
		
	}
	System.out.println("Total vowels are :"+allVowels);
	System.out.println("That vowels are :"+countvowels);
	}

}
