package datastructure;

import com.mysql.cj.core.exceptions.ClosedOnExpiredPasswordException;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> waitingQueue= new LinkedList<>();

		waitingQueue.add("Hassan");
		waitingQueue.add("MAHADE");
		waitingQueue.add("COOKIE");
		waitingQueue.add("ABDUL");
//		System.out.println("waitingQueue : " + waitingQueue);
//		System.out.println("waitingQueue : " + waitingQueue.peek());
//		System.out.println("waitingQueue : " + waitingQueue.remove("Hassan"));
//		System.out.println(waitingQueue);
//		System.out.println(waitingQueue.poll());
//		System.out.println(waitingQueue);

		if (((String)waitingQueue.peek()).equals("Hassan")) {
			System.out.println((String)waitingQueue.poll());
		}

		Iterator it = waitingQueue.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(waitingQueue);






	}




}
