package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter Student Name, First note (0-30), Second note(0-35) and Third note(0-35): ");
		
		student.setName(sc.nextLine());
		student.setFirstNote(sc.nextDouble());
		student.setSecondNote(sc.nextDouble());
		student.setThirdNote(sc.nextDouble());
		
		System.out.println(student.toString());
		sc.close();
	}
	
}
