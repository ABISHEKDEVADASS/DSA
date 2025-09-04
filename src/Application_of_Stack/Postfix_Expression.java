package Application_of_Stack;

import java.util.Scanner;
class hi {
	Postfix_Expression pf=new Postfix_Expression();
	public static int Do_Operation(int top_index, String b, int[] array) {
	
			if(b.equals("+")) {
				int ans=array[top_index-1]+array[top_index];
				return ans;
				}	
			else if(b.equals("-")) {
				int ans=array[top_index-1]-array[top_index];
				return ans;
				}
			else if(b.equals("*")) {
				int ans=array[top_index-1]*array[top_index];
				return ans;
				}
			else if(b.equals("/")) {
				int ans=array[top_index-1]/array[top_index];
				return ans;
				}
		
		return 0;
		
	}	
}

public class Postfix_Expression {
	
	public static void main(String[] args) {
		int top = 0;
		int[] array= new int[3];
	
		
		
		
		Scanner scan=new Scanner(System.in);
		int a;
		int count=0;
		String b = null;
		
//		adding elements to array
		for(int i=0;i<3;i++) {
			System.out.println("Enter number: ");
			 a=scan.nextInt();
			 count++;
			array[i]=a;
			top=i;
		}
		
		
		
				
		
		hi h=new hi();
		
		for(int i=count-1;i>=1;i--) {
			System.out.println("Enter Operator:");
			b=scan.next();
			int operation=hi.Do_Operation(top,b,array);
			array[top-1]=operation;
			top--;
		}
		
			
			
		
		
		
		scan.close();
		
		
		
		
		
		//display
		System.out.println("before added");
//		for(int i=2;i>=0;i--) {
			System.out.println(array[0]);
//		}
//		System.out.println("Operator: "+b);
//		
	}
}
