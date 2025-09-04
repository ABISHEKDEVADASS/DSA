package Searches;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int find=s.nextInt();
	int a[]= {9,8,7,6,5,4,3,2,1};
	boolean flag=true;
	
	for(int i=0;i<a.length;i++) {
		if(find==a[i]) {
			System.out.println(i);
			flag=false;
			break;
			
		}
	}
	if(flag) {
		System.out.println("Number Not Founded");
	}
	s.close();
}
}
