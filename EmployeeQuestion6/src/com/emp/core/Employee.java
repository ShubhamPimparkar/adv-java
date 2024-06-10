package com.emp.core;

import java.time.LocalDate;
import java.util.Objects;

import com.emp.empenums.EmpType;

public class Employee {

	private static int count;
	private int empId;
	private String name;
	private LocalDate joinDate;
	private long phoneno;
	private long addhar;
	private EmpType emptype;
	private double montlysal;
	private double hourlysal;
	
	static {
		count=1;
	}
	
	public Employee(String name, LocalDate joinDate, long phoneno, long addhar, EmpType emptype, double montlysal,
			double hourlysal) {
		this.empId=count++;
		this.name = name;
		this.joinDate = joinDate;
		this.phoneno = phoneno;
		this.addhar = addhar;
		this.emptype = emptype;
		this.montlysal = montlysal;
		this.hourlysal = hourlysal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public long getAddhar() {
		return addhar;
	}
	public void setAddhar(long addhar) {
		this.addhar = addhar;
	}
	public EmpType getEmptype() {
		return emptype;
	}
	public void setEmptype(EmpType emptype) {
		this.emptype = emptype;
	}
	public double getMontlysal() {
		return montlysal;
	}
	public void setMontlysal(double montlysal) {
		this.montlysal = montlysal;
	}
	public double getHourlysal() {
		return hourlysal;
	}
	public void setHourlysal(double hourlysal) {
		this.hourlysal = hourlysal;
	}
	public int getEmpId() {
		return empId;
	}

	@Override
	public int hashCode() {
		return this.empId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return addhar == other.addhar;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", joinDate=" + joinDate + ", phoneno=" + phoneno
				+ ", addhar=" + addhar + ", emptype=" + emptype + ", montlysal=" + montlysal + ", hourlysal="
				+ hourlysal + "]";
	}
	
	
	
	
}
