package com.emp.validate;

import java.time.LocalDate;
import java.util.Map;

import com.emp.core.Employee;
import com.emp.empenums.EmpType;
import com.emp.empexceptions.EmployeeException;

public class Validate {

	public static Employee validateFTE(String name, String joinDate, String phoneno, String addhar, double montlysal)
			throws EmployeeException {

		String empname = name;
		double empMontlySal = montlysal;
		LocalDate join = LocalDate.parse(joinDate);
		long phone = phoneNoValidation(phoneno);
		long addharCard = addharValidation(addhar);
		return new Employee(empname, join, phone, addharCard, EmpType.FullTimeEmployee, empMontlySal, 0);

	}

	public static Employee validatePTE(String name, String joinDate, String phoneno, String addhar, double hourlysal)
			throws EmployeeException {

		String empname = name;
		double hourly = hourlysal;
		LocalDate join = LocalDate.parse(joinDate);
		long phone = phoneNoValidation(phoneno);
		long addharCard = addharValidation(addhar);
		return new Employee(empname, join, phone, addharCard, EmpType.PartTimeEmployee, 0, hourly);

	}

	public static long phoneNoValidation(String phone) throws EmployeeException {
		if (phone.matches("^\\d{10}.*$")) {
			long phoneNum = Long.parseLong(phone);
			return phoneNum;
		} else {
			throw new EmployeeException("Invalid Phone Number");
		}
	}

	public static long addharValidation(String addhar) throws EmployeeException {
		if (addhar.matches("^[^\\D\\s]{12}$")) {
//			if (addhar.matches("^[a-zA-Z0-9@#\\$]{7,14}$")) {
	
			long addharCard = Long.parseLong(addhar);
			return addharCard;
		} else
			throw new EmployeeException("Invalid Addhar Number");

	}

}
