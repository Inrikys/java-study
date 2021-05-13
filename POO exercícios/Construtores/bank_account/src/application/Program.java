package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit(y/n)?");
		char hasDeposit = sc.next().charAt(0);
	    sc.nextLine();
		
		BankAccount bankAccount;
		if(hasDeposit == 'y') {
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();
			bankAccount = new BankAccount(number, holder, value);
		} else {
			bankAccount = new BankAccount(number, holder);
		}
		
		System.out.println("Account data: ");
		System.out.println(bankAccount.toString());
		
		System.out.println("Enter a deposit value: ");
		bankAccount.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(bankAccount.toString());
		
		System.out.println("Enter a withdraw value: ");
		bankAccount.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(bankAccount.toString());
	}

}
