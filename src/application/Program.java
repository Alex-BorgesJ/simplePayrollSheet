package application;

import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Neme: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary; ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage  = sc.nextDouble();
		employee.increaseSalary (percentage);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		
		sc.close();
	}

}
