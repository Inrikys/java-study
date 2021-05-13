package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student[] rooms = new Student[10];

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d %n", i+1 );
			
			System.out.printf("Name: ");
			String name = sc.nextLine();
			
			System.out.printf("E-mail: ");
			String email = sc.nextLine();
			
			System.out.printf("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			System.out.println(" ");
			rooms[room] = new Student(name, email);
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("%d: %s %n", i, rooms[i].toString());
			}
		}

	}

}
