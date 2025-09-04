package Tree;
class Node{
	public Node(int data2) {
		this.data=data2;
		// TODO Auto-generated constructor stub
	}
	int data;
	Node left;
	Node right;
}
class Tree{
	Node root;
	public Tree(int data) {
		root=new Node(data);
	}
	
	//for insertion
	public void insert(int data) {
		insert_into_tree(data,root);
		
		
	}
	public Node insert_into_tree(int data,Node root) {
		if(root == null) {
			return new Node(data);
		}
	else if(data<root.data) {
			root.left=insert_into_tree(data,root.left);
		}
		else {
			root.right=insert_into_tree(data,root.right);
		}

		return root;
		
	}
	//insertion----end
	
	
	
	//for display
	public void inorder_traverse() {
		System.out.println("List of Elements");
		display(root);
	}
	public void display(Node root) {
		
		int max=0;
		
		if(root==null) {
			return;
		}
		
		else {
			
			display(root.left);
			System.out.println(root.data);
			display(root.right);
			
		}
//		System.out.println(max);
		
	}
	//display---end
	
	
	
	
//check if node is present or not
	public void find_Node(int data, Node root) {
		// TODO Auto-generated method stub
		
		if(root.data==data) {
			System.out.println("Element is Found");
			return;
		}
		if(root.left==null) {

			System.out.println("Element is not Found");
			return;
			
		}
		if(data<root.data) {
			find_Node(data,root.left);
		}
		else {
			find_Node(data,root.right);
		}
	}
	//check if node is present or not ----->end

	
	
	
	//finding minimum node
	public void Minimum_Node(Node root) {
		
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		else {
			Minimum_Node(root.left);
			if(root.left == null) {
				System.out.print("Minimum Number is : ");
				System.out.print(root.data);
				System.out.println();
			}
		}
	}
	//finding minimum node ----> end
	
	

	//finding maximum node
	public void Maximum_Node(Node root) {
		
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		else {
			Maximum_Node(root.right);
			if(root.right == null) {

				System.out.print("Maximum Number is : ");
				System.out.print(root.data);
			}
		}
	}
	//finding maximum node ----> end

	public void deletion(Node root,int data) {
//		Node temp;
		if(data<root.data) {
			if(root.left.data==data) {
//				System.out.println("hi"+root.left.data);
//				root.left=root.left.left.left;
//				System.out.println("hi"+root.left);
////				if(root.left.left==null | root.right.right==null) {
					root.left=null;
//				}
				
			}
			else {
				deletion(root.left,data);
			}
		}
		else {
			if(root.right.data==data) {
				root.right=null;
			}
			else {
				deletion(root.right,data);
			}
			
		}
		
		
	
	}
		
		

		
	}
	


public class Binary_Search_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree(40);
		t.insert(30);
		t.insert(60);
		t.insert(50);
		t.insert(41);
		t.insert(0);
		

		t.inorder_traverse();
		
		
		t.find_Node(14,t.root);
		t.find_Node(0,t.root);
		
		
		t.Minimum_Node(t.root);
		t.Maximum_Node(t.root);
		
		t.deletion(t.root,0);
//		t.inorder_traverse();
		t.inorder_traverse();
		
		
	}

}
