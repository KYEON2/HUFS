import java.io.*;
import java.util.*;

public class Main {
	public static float sum(float n, float m) {
		return n+m;
	}
	public static float sub(float n, float m) {
		return n-m;
	}
	public static float mul(float n, float m) {
		return n*m;
	}
	public static float div(float n, float m) {
		return n/m;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		float num1 = scanner.nextFloat();
		
		float num2 = scanner.nextFloat();
		
		float sum = sum(num1, num2);
		float sub = sub(num1, num2);
		float mul = mul(num1, num2);
		float div = div(num1, num2);
		
		System.out.println(num1+ " + " + num2 + " = " + sum);
		System.out.println(num1+ " - " + num2 + " = " + sub);
		System.out.println(num1+ " * " + num2 + " = " + mul);
		System.out.println(num1+ " / " + num2 + " = " + div);
	}

}
