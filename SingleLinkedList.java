package dataStructure;
class Node{
	int data;
	Node next;
}

class SLL{
	Node head,tail;
	void insert(int d) {
		Node n=new Node();
		n.data=d;
		if(head == null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}
	void display() {
		Node temp=head;
		while(temp != null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
	}
}

public class SingleLinkedList {
public static void main(String args[]) {
	SLL sll = new SLL();
	sll.insert(1);
	sll.insert(2);
	sll.insert(3);
	sll.display();
}
}
