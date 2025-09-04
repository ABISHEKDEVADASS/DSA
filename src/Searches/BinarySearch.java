package Searches;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
				//f		l		   L
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int find=s.nextInt();
		int f=0;
		int l=a.length-1;
		int mid;
		boolean flag=true;
		while(f<=l) {
			mid=(f+l)/2;
			if(a[mid]==find) {
				System.out.println("Index of "+find+" is :"+mid);
				flag=false;
				break;
			}
			else if(a[mid]>find) {
				l=mid-1;
			}
			else if(a[mid]<find) {
				f=mid+1;
			}
		}
		if(flag) System.out.println("you entered number is not in our array");
		
		
	}
}
