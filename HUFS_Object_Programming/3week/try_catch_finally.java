import java.io.*;
import java.util.*;

class Main {
	public static int sum(int n, int m) {
		return n + m; 
	}
	public static int sub(int n, int m) {
		return n - m; 
	}
	public static int mul(int n, int m) {
		return n * m; 
	}
	public static int div(int n, int m) {
		return n / m; 
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
	
		
		while(true){
			int num1 = scanner.nextInt();
		
			int num2 = scanner.nextInt();
		
			int sum = sum(num1, num2);
			int sub = sub(num1, num2);
			int mul = mul(num1, num2);
			
			try {
				int div = div(num1, num2);
				
				System.out.println(num1+ " + " + num2 + " = " + sum);
				System.out.println(num1+ " - " + num2 + " = " + sub);
				System.out.println(num1+ " * " + num2 + " = " + mul);
				System.out.println(num1+ " / " + num2 + " = " + div);
				break;
			}
		
			catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
		scanner.close();
		
		
	}
}