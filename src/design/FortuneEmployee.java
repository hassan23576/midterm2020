package design;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo emp = new EmployeeInfo();
		emp.companyProfile();

		EmployeeInfo employee1 = new EmployeeInfo(001,"Mr. Azab Gazab","Sales");
		EmployeeInfo employee2 = new EmployeeInfo(002,"Mr. Pnakaj Udash","Marketing");
		EmployeeInfo employee3 = new EmployeeInfo(003,"Mrs. Gobet Tofu","Useless");
		EmployeeInfo employee4 = new EmployeeInfo(004,"Mr. Kala Bilai ","Useless");
		EmployeeInfo employee5 = new EmployeeInfo(001,"Mr. king Stupid","Accounts");

		employee1.setSalary(6000);
		employee1.calculateSalary(employee1.getSalary());
		employee2.setSalary(10000);
		employee2.calculateSalary(employee2.getSalary());
		employee3.setSalary(100);
		employee3.calculateSalary(employee3.getSalary());
		employee4.setSalary(80);
		employee4.calculateSalary(employee4.getSalary());
		employee5.setSalary(750);
		employee5.calculateSalary(employee5.getSalary());

		employee1.setPerformance(4);
		double bonus001 = employee1.calculateEmployeeBonus(employee1.getSalary(), employee1.getPerformance());
		employee2.setPerformance(5);
		double bonus002 = employee2.calculateEmployeeBonus(employee2.getSalary(), employee2.getPerformance());
		employee3.setPerformance(0);
		double bonus003 = employee3.calculateEmployeeBonus(employee3.getSalary(), employee3.getPerformance());
		employee4.setPerformance(0);
		double bonus004 = employee4.calculateEmployeeBonus(employee4.getSalary(), employee4.getPerformance());
		employee5.setPerformance(3);
		double bonus005 = employee4.calculateEmployeeBonus(employee5.getSalary(), employee5.getPerformance());

		//EmployeeInfo.calculateEmployeePension(employee1.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord001 = new ArrayList<Object>();
		employeeRecord001.add(employee1.employeeName());
		employeeRecord001.add(employee1.employeeId());
		employeeRecord001.add(bonus001);

		List<Object> employeeRecord002 = new ArrayList<Object>();
		employeeRecord002.add(employee2.employeeName());
		employeeRecord002.add(employee2.employeeId());
		employeeRecord002.add(bonus002);

		employeeInfo.put(1, employeeRecord001);
		employeeInfo.put(2, employeeRecord002);

		ConnectToSqlDB connect = new ConnectToSqlDB();


		for (Integer obj : employeeInfo.keySet()) {
			for (Object obj1 : employeeInfo.get(obj)) {
				System.out.println(obj1);
				List<String> list1 = new ArrayList<>();
				list1.add(obj.toString());
				list1.add(obj1.toString());
				connect.createTableFromStringToMySql2col("employee","employee_name","employeeID");
			}

		}



	}

}}
