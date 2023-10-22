import java.io.*;
import java.util.*;

class Calc {
	// static 함수 두개 선언 1) abs(double a) 2) getArea(double radius)
	// 1. abs(double a) 함수 작성
	// 2. Circle 클래스의 PI를 사용하여 Circle의 넓이를 구하는 getArea(double radius)함수 작성
	public static double abs(double a){
		return (a>0)?a:-a;
	}
	
	public static double getArea(double radius){
		return radius*radius*Circle.PI;
	}
}

class Circle {
	// final 변수 PI = 3.14 선언
	public static final double PI = 3.14;
	String name;
	double radius;
	double area;
	
	public Circle() {
		name = "Circle"; radius = 0; area = 0;
	}
	
	public Circle(String name, double radius) {
		this.name = name; this.radius = radius; area = 0;
	}
	
	public String getName() {
		return name;
	} 
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle [] c = { new Circle(), new Circle(), new Circle()};
		int count = 0;
		
		
		// 크기가 3인 Circle 객체 배열 c 선언 후 이름이 Circle이고 radius가 0인 객체로 초기화
		
		for(int i=0; i<3; i++){
			String command = scanner.next();
			
			if(command.equals("Break")){
				break;
			}
			
			c[i].name = command;
			double num = scanner.nextDouble();
			c[i].radius = Calc.abs(num);
			c[i].area = Calc.getArea(c[i].radius);
			
		}
		for(int j=0; j<c.length; j++){
				System.out.printf("%s의 넓이: %.2f\n", c[j].name, c[j].area);
			}
	}
		
}