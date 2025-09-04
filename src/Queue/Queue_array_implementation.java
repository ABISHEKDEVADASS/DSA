package Queue;
 class Queue_handler{
	 int arr[]=new int[5];
	 int front=-1;
	 int rear=-1;
	 int inc=0;
	 int max=4;
	 
	 public void enqueue(int data) {
		 
		 if(front!=0 && rear==max) {
		 arr[inc]=data;
		 rear=inc;
		 max=rear;
		 inc++;
		 System.out.println("it is "+ inc);
		 }	
	 else if(front==-1) {
			 front++;
			 rear++;
			 arr[rear]=data; 	 
		 }
		 else if(front==0) {
			 if(rear>=arr.length-1) {
				 System.out.println("Array is full!");	 
			 }
			 else {
				 
				 rear++;
				 arr[rear]=data;  
			 }
			
		 }
		 
	 }
	 
	 public void dequeue() {
		 front++; 
	 }
	 public void display() {
		 for(int i=front;i<=rear;i++) {
		
			 System.out.println(arr[i]);
		 }
	 }
	 public void displayc() {
		 System.out.println("display c");
		 int f=front;
//		 System.out.println(f);
		 System.out.println(arr[f]);
		 while(f != rear) {	
			 if(f==4) {
				 f=0;
			 }
			 else {
				 f++; 
			 }
//			 System.out.println(f);
			 System.out.println(arr[f]);		 
		 }
	 }
	 public void peek() {
		 System.out.println("Peek element is : "+arr[front]);
	 }
	 public void all() {
		 System.out.println("All elements : ");
		 for(int val:arr)
		 System.out.println(val);
	 }
}
 
public class Queue_array_implementation {
public static void main(String[] args) {
Queue_handler q= new Queue_handler();	
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
q.enqueue(50);
//q.enqueue(60);


q.dequeue();
//q.dequeue();
//q.dequeue();

q.enqueue(60);


q.display();  //normal queue

q.peek();

q.all();
q.displayc();  //circle queue
}
}
