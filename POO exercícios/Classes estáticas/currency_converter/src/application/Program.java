package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice;
		double value;
		
		System.out.println("What is the dollar price?");
		dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		value = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convertRealToDollar(dollarPrice, value));
	}

}
