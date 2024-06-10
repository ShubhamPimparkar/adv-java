package com.emp.utility;

import java.util.Map;

import com.emp.core.Employee;
import com.emp.empexceptions.EmployeeException;

public class Utility {

	public static String addFullTime(Employee emp1, Map<Integer, Employee> empmap) {
		empmap.put(emp1.getEmpId(), emp1);
		return "Employee Added..";
	}

	public static void displayEmp(Map<Integer, Employee> empmap) {
		empmap.forEach((k, v) -> System.out.println(v));

	}

	public static String addPartTime(Employee emp2, Map<Integer, Employee> empmap) {
		empmap.put(emp2.getEmpId(), emp2);
		return "Employee Added..";
	}

	public static String delUser(int empid, Map<Integer, Employee> empmap) {
//		empmap.values().stream().filter(l->l.getEmpId()==empid).forEach(l->empmap.remove(l.getEmpId()));

		if (empmap.containsKey(empid)) {
			empmap.remove(empid);
			return "Removed User";

		} else
			return "Cannot Find User";
	}

	public static String delName(String name, Map<Integer, Employee> empmap) throws EmployeeException {
		boolean val = empmap.values().removeIf(l -> l.getName().equals(name));
		if (val) {

			return "Deleted by Name";
		} else
			throw new EmployeeException("cant delete..");
	}

	public static Employee searchAddhar(long addharId, Map<Integer, Employee> empmap) throws EmployeeException {
		for (Employee e : empmap.values()) {
			if (e.getAddhar() == addharId) {
				return e;
			}
		}
		throw new EmployeeException("Addhar not Found..");
	}

	public static void sortDate(Map<Integer, Employee> empmap) {
		empmap.values().stream()
		.sorted((s1,s2)->s1.getJoinDate().compareTo(s2.getJoinDate()))
		.forEach(l->System.out.println(l));
		
	}

}
