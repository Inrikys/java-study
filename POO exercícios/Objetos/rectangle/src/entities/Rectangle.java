package entities;

public class Rectangle {

	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return this.height * this.width;
	}
	
	public double perimeter() {
		return this.height * 2 + this.width *2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", this.area()) + "\n"
				+ "PERIMETER = " + String.format("%.2f", this.perimeter()) + "\n"
				+ "DIAGONAL = " + String.format("%.2f", this.diagonal());
	}
	
}
