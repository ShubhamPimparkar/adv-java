package com.emp.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.emp.core.Employee;
import com.emp.empexceptions.EmployeeException;
import com.emp.utility.Utility;
import com.emp.validate.Validate;

public class EmployeeTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Map<Integer,Employee> empmap = new HashMap<>();
			boolean exit=false;
			while(!exit) {
				try {
				System.out.println("Application Menu:\r\n"
						+ "1.Add full time employee\r\n"
						+ "2.Add part time employee\r\n"
						+ "3.Delete an employee by Emp Id\r\n"
						+ "4.Search employee details by Aadhaar number\r\n"
						+ "5.Display all employee details\r\n"
						+ "6.Display all employee details sorted by date of joining\r\n"
						+ "7.Delete by name");
				switch (sc.nextInt()) {
				case 1:		
					System.out.println("FTE : Name - joinDate - Phone - addhar - montlysal");
					Employee emp1 = Validate.validateFTE(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
					String res = Utility.addFullTime(emp1,empmap);
					System.out.println(res);
					break;
				case 2:
					System.out.println("PTE : Name - joinDate - Phone - addhar - Hourlysal");
					Employee emp2 = Validate.validatePTE(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
					String res2 = Utility.addPartTime(emp2,empmap);
					System.out.println(res2);
					
					break;
				case 3:
					System.out.println("Delete by ID");
					String res3 = Utility.delUser(sc.nextInt(),empmap);
					System.out.println(res3);
					break;
				case 4:
					System.out.println("Enter Addhar ID-");
					Employee emp = Utility.searchAddhar(sc.nextLong(),empmap);
					System.out.println(emp);
					break;
				case 5:
					Utility.displayEmp(empmap);
					break;
				case 6:
					Utility.sortDate(empmap);
					break;
				
				case 7:
					System.out.println("Enter name to delete");
					String res7 = Utility.delName(sc.next(),empmap);
					System.out.println(res7);
					break;
					

				default:
					exit=true;
					break;
				}
				}
				catch (Exception e) {
					sc.nextLine();
					System.out.println(e.getMessage());
				}
			}
			
			
		}
	
	}

}
