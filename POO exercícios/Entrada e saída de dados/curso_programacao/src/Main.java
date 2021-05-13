import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Force Locale US pattern for float numbers
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World!");
		
		String x;
		int y;
		double z;
		
		// Reading a string data
		System.out.println("Type a string");
		x = sc.next();
		System.out.println("You typed: " + x);
		
		// Reading a integer data
		System.out.println("Type a int");
		y = sc.nextInt();
		System.out.println("You typed: " + y);
		
		// Reading a double data
		System.out.println("Type a double");
		z = sc.nextDouble();
		// Locale based on US pattern
		System.out.println("You typed: " + z);
		// Locale based on your computer
		System.out.printf("You typed: %.2f%n ", z);	
		
		
		sc.close();
	}

}
