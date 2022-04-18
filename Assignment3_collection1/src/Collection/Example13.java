package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q=new PriorityQueue<Integer>();
		System.out.println("The removed element is "+q.poll());
		System.out.println("The head element is "+q.peek());
	}

}
