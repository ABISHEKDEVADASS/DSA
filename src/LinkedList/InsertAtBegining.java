package LinkedList;

public class InsertAtBegining {
Node head;
	
	public void InsertAtBegining(int data) {
		Node n=new Node();
		if(head==null) {
			n.data=data;
			n.next=null;
			head=n;
			
		}
		else if(head!=null) {
			n.data=data;
			n.next=head;
			head=n;
			
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}
