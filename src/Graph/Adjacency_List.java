package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;

class array_list{
//	int sqq=01;
	ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
//	public array_list1(int data) {
//		
//	}
	
	
	public void insert(int arr_index,int num) {
		arr.get(arr_index).add(num);
	}
	public void  display() {
		
		for(int j=0;j<arr.size();j++) {

			System.out.println("Elements of Set: "+j);
			for(int i=0;i<arr.get(j).size();i++) {
				System.out.println(arr.get(j).get(i));
			}
			
		}
	}
	public void array_list1(int data) {
		// TODO Auto-generated method stub
		for(int i=0;i<data;i++) {
			arr.add(new ArrayList<Integer>());
		}
	}
	
}
//class Queue{
////	Queue<Integer> = new LinkedList<>();
//	queue.add(1);
//
//}

public class Adjacency_List {
	public static void main(String[] args) {

	array_list a=new array_list();
	BFS_Traversel bfs=new BFS_Traversel();
	a.array_list1(6);
	a.insert(0, 4);
	a.insert(0, 2);
	a.insert(1, 4);
	a.insert(2, 0);
	a.insert(2, 3);
	a.insert(3, 2);
	a.insert(3, 4);
	a.insert(3, 5);
	a.insert(4,0);
	a.insert(4, 3);
	a.insert(4, 1);
	a.insert(5, 3);
		a.display();
		bfs.bfs();
		
	}

}


class BFS_Traversel {

	array_list arr_list2= new array_list();
//	arr_list2.arr.get(0);
	void bfs() {
		System.out.println(arr_list2.arr.get(0).get(0));
	}
	
	
}

