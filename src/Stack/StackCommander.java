package Stack;
class stack{
	int top=-1;
	StackCommander sc=new StackCommander();
	public void push(int i) {
		top++;
		sc.a[top]=i;
	}
	public void display() {
		int dumm_top=top;
	
		for(int i=dumm_top;i>=0;i--) {

			System.out.println(sc.a[dumm_top]);
			dumm_top--;
		}
	}

	public void pop() {
		top--;
		
	}

	public void peek() {
		System.out.println("top positioned element is: "+sc.a[top]);
		
	}
}
public class StackCommander {
	int[] a=new int[10];
public static void main(String[] args) {
	
	stack s=new stack();
	s.push(1);
	s.push(2);
	s.push(3);
	
	s.pop();
	
	s.display();
	
	s.peek();
	
}
}
