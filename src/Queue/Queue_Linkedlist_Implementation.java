package Queue;

class Node{
	int data;
	Node next;
	

	public Node(int data) {
		this.data=data;
	}
}
class Queue{
	Node front,rear;
	
	public void enqueue(int data) {
		Node n=new Node(data);
		if(rear==null) {
			rear=n;
			front=n;
		}
		else {
			rear.next=n;
			rear=n;
		}
		
		
	}

	public void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
		public void size() {
			
		int count=0;
			Node temp1=front;
			while(temp1!=null) {
				count++;
				temp1=temp1.next;
			
			}	
			System.out.println("Number of elements : "+count);
		
	}
	public void dequeue() {
		front=front.next;
		System.out.println("deleted elements : "+front.data);
	}
	public void Peek() {
		if(rear==null || front==null) {
			System.out.println("In Peek there is no elements");
		}
		else {
			
			System.out.println("First elements : "+front.data);
		}

	}
	
	public void isEmpty() {
		if(front==null || rear==null) {
			System.out.println("No elements");
			
		}
		else {
			System.out.println("Elements are presented");
		}
	}
	
	
}
public class Queue_Linkedlist_Implementation {

	public static void main(String[] args) {
		
		Queue q=new Queue();
		System.out.println("inserted elements");
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.display();

		
		
		q.dequeue();
		q.dequeue();
		
		
		System.out.println("elements after deletion");
		q.display();
		
		
		q.Peek();
		
		q.isEmpty();
		
		q.size();

	}

}
