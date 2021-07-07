package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont;

		System.out.println("How many employess will be registered?");
		cont = sc.nextInt();

		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < cont; i++) {

			Employee e;
			System.out.printf("Employee #%d: \n", i + 1);
			System.out.printf("Id: ");
			Long id = sc.nextLong();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again!");+
				id = sc.nextLong();
			}

			System.out.printf("Name: ");
			// Limpar buffer porque senão o nextLine seguinte leria o enter do input
			// anterior
			sc.nextLine();
			String name = sc.nextLine();

			System.out.printf("Salary:  ");
			Double salary = sc.nextDouble();
			System.out.printf("");
			e = new Employee(id, name, salary);
				
			list.add(e);
		}
		
		System.out.printf("Enter the employee id that will have salary increase: ");
		Long filterId = sc.nextLong();

		// Retornando objeto via stream
		// Employee result = (Employee) list.stream().filter(x -> x.getId() ==
		// filterId).findFirst().orElse(null);

		// Utilizando função auxiliar
		Integer result = position(list, filterId);

		if (result == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.printf("Enter de percentage: ");
			double percentage = sc.nextDouble();

			// Retornando objeto via stream
			// result.increaseSalary(percentage);

			// Utilizando função auxiliar
			list.get(result).increaseSalary(percentage);
		}

		for (Employee x : list) {
			System.out.println(x);
		}

	}

	// Utilizando função auxiliar
	public static Integer position(List<Employee> list, Long id) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, Long id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
