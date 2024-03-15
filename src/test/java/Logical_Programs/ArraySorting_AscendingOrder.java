package Logical_Programs;

public class ArraySorting_AscendingOrder {
	public static void main(String[] args) {
	int ar[]=new int[] {20,10,50,60,70,20,90,80};
	
	for(int i=0;i<=ar.length-1;i++) {
		
		for(int j=i+1;j<=ar.length-1;j++) {
			
			if(ar[i]>ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		
	}
	for(int k=0;k<=ar.length-1;k++) {
		System.out.print(" "+ar[k]);
	}

	
}
	static {
		System.out.println("sorting of array in ascending formate :");
	}
}
