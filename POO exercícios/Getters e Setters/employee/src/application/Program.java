package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Enter Employee's Name, Gross salary and Tax:");
		employee.setName(sc.nextLine());
		employee.setGrossSalary(sc.nextDouble());
		employee.setTax(sc.nextDouble());
		
		System.out.print("Employee: ");
		System.out.println(employee.toString());
		
		System.out.println("Which percentage to increase salary?");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.print("Updated data: ");
		System.out.println(employee.toString());
		sc.close();
	}

}
