package com.hsbc.oct5;

import java.time.LocalDate;

public class Employee {

	private  int eId;
	private String eName;
	private double eSalary;
	private LocalDate dob;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Employee(int eId, String eName, double eSalary, LocalDate dob) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", dob=" + dob + "]";
	}
	
	
	
}
