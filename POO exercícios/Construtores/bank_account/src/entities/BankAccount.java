package entities;

public class BankAccount {
	
	private int accountNumber;
	private String holder;
	private double total;
	public static double withdrawTax = 5.00;
	
	
	public BankAccount(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public BankAccount(int accountNumber, String holder, double total) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.deposit(total);
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public void setOwnerName(String holder) {
		this.holder = holder;
	}
	
	public double getTotal() {
		return total;
	}	
	
	public void deposit(double value) {
		this.total += value;
	}
	
	public void withdraw(double value) {
		this.total -= value + withdrawTax;
	}
	
	public String toString() {
		return "Account " + this.getAccountNumber() + ", "
				+  "Holder: " + this.getHolder() + ", "
				+ "Balance: $" + String.format("%.2f", this.getTotal());
	}
	
}
