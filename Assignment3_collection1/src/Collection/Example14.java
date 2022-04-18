package Collection;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.Iterator;

public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Queue<Integer>q=new ArrayDeque<Integer>();
		for(i=0;i<15;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		((ArrayDeque<Integer>) q).addLast(20);
		System.out.println("deque:"+q);
		ArrayDeque<Integer> deque = null;
		boolean isAdded = deque.offerLast(30);
		System.out.println("isAdded:"+isAdded);
		Collection<Integer> queue = null;
		Iterator<Integer>itr=queue.iterator();
		System.out.println("Iterating elements");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
