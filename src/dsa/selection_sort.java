package dsa;

import java.util.Arrays;

public class selection_sort {

	public static void main(String[] args) {
			int a[]= {9,8,7,6,5,4,3,2,1};
			int temp;
			
			for(int j=0;j<a.length;j++) {
				int index=j;
				
				for(int i=j+1;i<a.length;i++) {
					if(a[index]>a[i]) {
						index=i;
					}
				}
				temp=a[j];
				a[j]=a[index];
				a[index]=temp;	
			}
			
			
			
			System.out.println(Arrays.toString(a));
			
	}

}
