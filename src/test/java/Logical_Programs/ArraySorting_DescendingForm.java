package Logical_Programs;

public class ArraySorting_DescendingForm {
	public static void main(String[] args) {
		int ar[]=new int[] {10,90,60,50,40,30,20,70,80};
		
		for(int i=0;i<=ar.length-1;i++) {
			for(int j=i+1;j<=ar.length-1;j++) {
				
				if(ar[j]<ar[i]) {         
					int temp=ar[j];         
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		
		for(int k=0;k<=ar.length-1;k++) {
			System.out.print(" "+ar[k]);
		}
		}
	

}
