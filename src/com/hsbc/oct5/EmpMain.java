package com.hsbc.oct5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class EmpMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		
		EmployeeDAOImpl dao = new EmployeeDAOImpl();

		dao.addEmp("Ankit1", LocalDate.of(1991, 01, 11), 345684);
		dao.addEmp("Ankit2", LocalDate.of(1992, 02, 12), 648468);
		dao.addEmp("Ankit3", LocalDate.of(1993, 03, 13), 9765332);
		dao.addEmp("Ankit4", LocalDate.of(1994, 04, 14), 645868);

		
		int choice = 0;
		
		do {

			System.out.println("1. Store \n" + "2. Sort and Display \n" + "3. Pick Top 3 \n" + "Other. Exit \n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the employee name:");
				String name = sc.next();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				System.out.println("Enter the employee birth data(dd/mm/yyyy):");
				String date = sc.next();
				LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

				dao.addEmp(name, localDate, salary);

				break;
			case 2:

				System.out.println("Choose type of sort:");

				System.out.println("1. Ascending Order by Id");

				System.out.println("2. Descending Order by Id");

				System.out.println("3. Ascending Order by Name");

				System.out.println("4. Descending Order by Name");

				System.out.println("5. Ascending Order by DOB");

				System.out.println("6. Descending Order by DOB");

				System.out.println("7. Ascending Order by Salary");

				System.out.println("8. Descending Order by Salary");

				int s = sc.nextInt();

				show(dao.sortEmployee(s));

				break;
				
			case 3:

				show(dao.upper3Emp());
				break;

			default:
				break;
			}

		} while (choice < 4 && choice > 0) ;

	}

	public static void show(List<Employee> emps) {

		for (Employee emp : emps)
			System.out.println(emp);

	}

}
