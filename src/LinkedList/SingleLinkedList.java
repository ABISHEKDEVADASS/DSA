package LinkedList;

public class SingleLinkedList {
public static void main(String[] args) {
	insert i=new insert();
	i.insert(1);
	i.insert(2);
	i.insert(3);
	i.insert(4);
	i.insert(5);
	i.insert(6);
	i.insert(7);
	
	
	
	i.insertAtPosition(2,124);
	i.insertAtPosition(1,17);
	
	i.deleteAtPosition(4);
	i.display();
	
	
	
	InsertAtBegining ib=new InsertAtBegining();
	ib.InsertAtBegining(4);
	ib.InsertAtBegining(3);
	ib.InsertAtBegining(2);
	ib.InsertAtBegining(1);
	ib.display();	
}
}
