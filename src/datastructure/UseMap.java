package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, String> stateOfUs = new HashMap<String, String>();
		stateOfUs.put("CT", "Connecticut");
		stateOfUs.put("AK", "Alaska");
		stateOfUs.put("AR", "Arkansas");

		System.out.println(stateOfUs.get("CT"));

		for (Map.Entry entry:stateOfUs.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		List<String> cityOfUSA = new ArrayList<>();
		cityOfUSA.add("CT");
		cityOfUSA.add("AK");
		cityOfUSA.add("AR");

		ConnectToSqlDB connect = new ConnectToSqlDB();

		List listOF = cityOfUSA;
		connect.insertDataFromArrayListToSqlTable(listOF,"cityOfUSA","City");
		System.out.println("Data showing from database:");
		List<String> numbers = connect.readDataBase("cityOfUSA","City");
		for(String st:numbers){
			System.out.println(st);
		}
		List<String> cityOfCanada = new ArrayList<>();
		cityOfCanada.add("Vancouver");
		cityOfCanada.add("Victoria");
		cityOfCanada.add("Regina");

		List listOc = cityOfCanada;
		connect.insertDataFromArrayListToSqlTable(listOc,"cityOfCANDA","City");
		System.out.println("Data showing from database:");
		List<String> numberc = connect.readDataBase("cityOfCANDA","City");
		for(String st:numberc){
			System.out.println(st);
		}

		List<String> cityOfUK = new ArrayList<>();
		cityOfUK.add("London");
		cityOfUK.add("Manchester");
		cityOfUK.add("Scotland");

		List listCUK = cityOfUK;
		connect.insertDataFromArrayListToSqlTable(listCUK,"cityOfUK","City");
		System.out.println("Data showing from database:");
		List<String> numberOfUK = connect.readDataBase("cityOfUK","City");
		for(String st:numberOfUK){
			System.out.println(st);
		}

		Map<String, List<String>> list = new LinkedHashMap<>();
		list.put("USA", cityOfUSA);
		list.put("Canada", cityOfCanada);
		list.put("UK", cityOfUK);
		System.out.println("View from HashMap");
		for (Map.Entry entry:list.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		connect.createTBFSM("use_map", "mapKey", "mapValue");
		for (Object str : list.keySet()) {
			for (String str1 : list.get(str)) {
				List<String> list1 = new ArrayList<String>();
				list1.add(str.toString()); // adds key
				list1.add(str1); // adds value
				// Insert data in the database
				connect.insertDataFromArrayListToSqlTable(list1, "use_map", "mapKey", "mapValue");
			}
		}
		System.out.println("Data showing from databases");
		List<String> number = connect.readDataBase("use_map", "mapKey", "mapValue");
		for(String st:number){
			System.out.println(st);
		}


		// Each loop to retrieve data
		System.out.println("Each loop to retrieve data");
		for (Object str : list.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : list.get(str)) {
				System.out.println("Value: " + str1);
			}
		}

		// using while loop with Iterator to retrieve data
		System.out.println("using while loop with Iterator to retrieve data");
		Iterator itr = list.entrySet().iterator();

		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			for (String str1 : list.get(values)) {
				System.out.println("Value: " + str1);
			}
		}

	}

}