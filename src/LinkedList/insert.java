package LinkedList;

public class insert {
	Node head,tail;
	
	public void insert(int data) {
		Node n=new Node();
		if(head==null) {
			n.data=data;
			n.next=null;
			head=n;
			tail=n;
		}
		else if(head!=null) {
			n.data=data;
			tail.next=n;
			tail=n;
			n.next=null;
			
		}
	}
	public void insertAtPosition(int position,int value) {
		Node temp1 = head;
		Node ne=new Node();
		for(int i=1;i<=position;i++) {
			temp1=temp1.next;
		}
		ne.next=temp1.next;
		temp1.next=ne;
		ne.data=value;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	public void deleteAtPosition(int j) {
		Node temp1 = head;
		Node temp2=head;
		for(int i=1;i<=j+1;i++) {
			temp1=temp1.next;
		}
		for(int q=1;q<j;q++) {
			temp2=temp2.next;
			
		}
		temp2.next=temp1;
	}
	
}
