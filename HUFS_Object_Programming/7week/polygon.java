import java.io.*;
import java.util.*;

class Point {
	protected int x;
	protected int y;
	
	Point (){
		x = 0;
		y = 0;
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double dist(Point p, Point q){
		double distance = Math.sqrt(Math.pow(q.x - p.x, 2) + Math.pow(q.y - p.y, 2));
		return distance;
	}
}


class Polygon extends Point{
	
	public Polygon(){
		super();
	}
	
	public double getPerimeter(Point pp [], int n){
		double perimeter = 0;
		for(int i=0; i < n-1; i++){
			perimeter += dist(pp[i], pp[i+1]);
		}
		perimeter += dist(pp[n-1], pp[0]);
		
		return perimeter;
	}
	
	public double getArea(Point pp [], int n){
		double area = 0;
		for(int i=0; i < n; i++){
			area += pp[i].x * pp[(i + 1) % n].y - pp[i].y * pp[(i + 1) % n].x;
		}
		area = Math.abs(area) / 2.0;
		
		return area;
	}
}


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		Point [] p = new Point[n];
		
		for(int i=0; i<n; i++){
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			p[i] = new Point(x,y);
		}
		
		Polygon polygon = new Polygon();
		double result_p = Math.round(polygon.getPerimeter(p, n) * 100)/ 100.0;
		double result_a = Math.round(polygon.getArea(p, n) * 100) / 100.00;
		
		System.out.printf("%.2f\n", result_p );
		System.out.printf("%.2f", result_a );
		
	}
}
