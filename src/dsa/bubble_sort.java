package dsa;

import java.util.Arrays;

public class bubble_sort {
	public static void main(String[] args) {
		int a[]= {9,8,7,6,5,4,3,2,1};
		
		System.out.println(Arrays.toString(a));
		int temp=0;
		
		for(int j=0;j<a.length-1;j++){
			for(int i=0;i<a.length-1-j;i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					
				}
				
			}	
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
