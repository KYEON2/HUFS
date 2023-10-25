import java.io.*;
import java.util.*;

class Shape {
	protected String name;
	protected double area;
	
	public void getArea() {
		System.out.printf("%s의 넓이: %.2f\n", name, area);
	}
}

class Circle extends Shape{
	private double radius;
	
	public Circle(String name, double radius){
		super();
		this.name = name;
		this.radius = radius;
	}
	
	public void getArea(){
		area = radius * radius *3.14;
		System.out.printf("%s의 넓이: %.2f\n", name, area);
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(String name, double length, double width){
		super();
		this.name = name;
		this.length = length;
		this.width= width;
	}
	
	public void getArea(){
		area = length*width;
		System.out.printf("%s의 넓이: %.2f\n", name, area);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while(count < 3){
			String name = scanner.next();
			if (name.equals("Circle")){
				double radius = scanner.nextDouble();
				Circle a = new Circle(name, radius);
				
				
				a.getArea();
				count += 1;
			}
			else if(name.equals("Rectangle")){
				double length = scanner.nextDouble();
				double width = scanner.nextDouble();
				
				Rectangle b = new Rectangle(name, length, width);
				
				b.getArea();
				count += 1;
			}
		}
		
	}
}