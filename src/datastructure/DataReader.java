package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = "/Users/Hassan/AllJavaProject/MidTerm2020/src/data/self-driving-car";
		FileReader fr = null;
		try{
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ConnectToSqlDB connect = new ConnectToSqlDB();
		BufferedReader bf = new BufferedReader(fr);
		String text;

		Stack stack = new Stack();
		LinkedList<String> linkedList = new LinkedList<>();
		int count =0;

		connect.createTableFromStringToMySql("SelfDrivingCar","text");
		try {
			while ((text = bf.readLine()) != null) {
				System.out.println(text);
				String[] words = text.split(" ");
				for(int i =0; i<words.length; i++){
					stack.push(words[i]);

					linkedList.add(words[i]);

				}
				connect.insertDataFromStringToSqlTable(text, "SelfDrivingCar", "text");
			}
			//System.out.println("Total word count: "+count);


		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				bf.close();
				fr.close();

			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

		//retrieving data from database
		List<String> textRead = connect.readDataBase("SelfDrivingCar", "text");
		for(String st:textRead){
			System.out.println(st);
		}


		System.out.println("stack: ");
		for (int i=stack.size()-1; i>=0; i--) {
			System.out.println(""+ stack.get(i));
		}



		System.out.println("LinkedList: ");
		for(int i=0; i<linkedList.size(); i++){
			System.out.println(linkedList.get(i));
		}







		System.out.println("Peek: "+ stack.peek());
		System.out.println("Search: "+stack.search("steps!"));
		System.out.println("Pop: "+stack.pop());



		System.out.println("for each loop: ");
		for(Object st: stack) {
			System.out.print(st+" ");
		}
		System.out.println();


		System.out.println("while loop: ");
		while(!stack.empty()){
			System.out.print(stack.pop()+" ");
		}
		System.out.println();


		System.out.println("iterator: ");
		Iterator it = linkedList.iterator();
		while(it.hasNext()) {
			String obj = (String) it.next();
			System.out.print(obj+" ");
		}


	}

}
