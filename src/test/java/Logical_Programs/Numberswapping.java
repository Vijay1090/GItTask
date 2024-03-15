package Logical_Programs;

import java.util.Scanner;

public class Numberswapping {
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter first nuber :");
		int num1=scan.nextInt();
		System.out.println("Enter second Nu :");
		int num2=scan.nextInt();
	
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Num1 after swapping :"+num1);
		System.out.println("Num2 after swapping "+num2);

	}

}
