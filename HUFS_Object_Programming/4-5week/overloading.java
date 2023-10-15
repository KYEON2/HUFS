import java.io.*;
import java.util.*;

public class Figure {
	String name;
	double radius;
	double length;
	double width;
	double area;
	
	public Figure(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}
	
	public Figure(String name, double length, double width) {
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	public void getArea(double radius) {
		area = radius * radius *3.14;
	}
	public void getArea(double length, double width) {
		area = length * width;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Figure [] s = new Figure[4];
		
		for (int i=0; i < 4; i++){
			String input = scanner.nextLine();
			String[] parts = input.split(" ");
			if (parts[0].equals("Circle")){
				s[i] = new Figure(parts[0], Double.parseDouble(parts[1]));
				s[i].getArea(Double.parseDouble(parts[1]));
				System.out.printf("%s의 넓이: %.2f%n", s[i].name, s[i].area);
			}
			else if (parts[0].equals("Rectangle")){
				s[i] = new Figure(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
				s[i].getArea(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
				System.out.printf("%s의 넓이: %.2f%n", s[i].name, s[i].area);
			}
		}
	}
}