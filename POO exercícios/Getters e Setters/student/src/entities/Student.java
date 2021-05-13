package entities;

public class Student {
	
	private String name;
	private double firstNote;
	private double secondNote;
	private double thirdNote;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFirstNote() {
		return firstNote;
	}
	public void setFirstNote(double firstNote) {
		this.firstNote = firstNote;
	}
	public double getSecondNote() {
		return secondNote;
	}
	public void setSecondNote(double secondNote) {
		this.secondNote = secondNote;
	}
	public double getThirdNote() {
		return thirdNote;
	}
	public void setThirdNote(double thirdNote) {
		this.thirdNote = thirdNote;
	}
	
	public double finalGrade() {
		return this.firstNote + this.secondNote + this.thirdNote;
	}
	
	public String status() {
		return (this.finalGrade() >=60) ? "PASS" : "FAILED"  + "\n" + "MISSING " + String.format("%.2f", this.missingPoints()) + " POINTS";
	}
	
	public double missingPoints() {
		return 60 - this.finalGrade();
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", this.finalGrade()) + "\n"
		+ this.status();
	}
	
}
