package util;

public class CurrencyConverter {
	
	public static double IOF = 6.00/100;
	
	
	public static double convertRealToDollar(double dollarPrice, double value){
		double convertedValue = dollarPrice * value; 
		return convertedValue + (IOF  * convertedValue) ;
	}
	
}
