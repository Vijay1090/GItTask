package Logical_Programs;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String args[]) {
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter Number Whose Factorial want");
		int	num=sca.nextInt();

		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factirial of Given Number is :"+fact);
	}

}
