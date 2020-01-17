package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Integer> id = new ArrayList<>();

		id.add(1234);
		id.add(5678);
		id.add(9101);
		id.add(2345);
		id.add(5161);
		id.add(1819);
		id.add(2021);
		System.out.println("Retrieving elements from ArrayList: " + id);
		System.out.println("Arrays peek element: " + id.get(4));
		System.out.println("Remove element at index 3: " + id.remove(5));
		System.out.println("Re-retrieving elements from ArrayList: " + id);

		for (Integer intr : id) {
			System.out.print(" "+intr);
		}
		System.out.println();
		System.out.print("Re-retrieving elements from ArrayList: ");
		Iterator it = id.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(" "+i);
		}

		System.out.println();


		Collections.sort(id);
		System.out.println(id);
		List lists = new ArrayList();
		lists = id;


		ConnectToSqlDB ct = new ConnectToSqlDB();
		ct.insertDataFromArrayListToSqlTable(lists,"ArrayList", "ArrayData");
		List<String> numbers = ct.readDataBase("ArrayList", "ArrayData");
		for(String st:numbers){
			System.out.println(st);
		}


	}

}
