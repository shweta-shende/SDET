package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Priority1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("hi");
		queue.add("hello");
		queue.add("bye");
		queue.add("goodbye");
		queue.add("hihello");
		System.out.println(queue);
		System.out.println(queue.peek());//will fetch and not remove
		System.out.println(queue);
		System.out.println(queue.poll());//fetch and remove
		System.out.println(queue);
	}

}
