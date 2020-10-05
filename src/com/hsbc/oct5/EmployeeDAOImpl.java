package com.hsbc.oct5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDAOImpl {

	private List<Employee> employees = new ArrayList<>();

	public void addEmp(String name, LocalDate date, double salary) {

		employees.add(new Employee(1 + employees.size(), name, salary, date));
	}

	public List<Employee> upper3Emp() {
		List<Employee> sortData = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			sortData.add(employees.get(i));
		}

		return sortData;
	}

	public List<Employee> sortEmployee(int action) {

		switch (action) {
		case 1:
			Collections.sort(employees, (e1, e2) -> e1.geteId() - e2.geteId());
			break;

		case 2:
			Collections.sort(employees, (e1, e2) -> e2.geteId() - e1.geteId());
			break;

		case 3:
			Collections.sort(employees, (e1, e2) -> e1.geteName().compareTo(e2.geteName()));
			break;

		case 4:
			Collections.sort(employees, (e1, e2) -> e2.geteName().compareTo(e1.geteName()));
			break;

		case 5:
			Collections.sort(employees, (e1, e2) -> e1.getDob().compareTo(e2.getDob()));
			break;

		case 6:
			Collections.sort(employees, (e1, e2) -> e2.getDob().compareTo(e1.getDob()));
			break;

		case 7:
			Collections.sort(employees, (e1, e2) -> (int) (e1.geteSalary() - e2.geteSalary()));
			break;

		case 8:
			Collections.sort(employees, (e1, e2) -> (int) (e2.geteSalary() - e1.geteSalary()));
			break;

		default:
			return null;

		}

		return employees;
	}

}
