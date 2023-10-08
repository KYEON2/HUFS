import java.io.*;
import java.util.*;

public class Main {
	public static int compare(int num1, int num2, int num3) {
		int max = 0;
		int first = ((num1>num2)?num1:num2);
		max = ((first > num3)? first: num3);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		
		int num1 = scanner.nextInt();
		
		int num2 = scanner.nextInt();
		
		int num3 = scanner.nextInt();
		
		int max= compare(num1, num2, num3);
		System.out.println("가장 큰 숫자는 " + max + "입니다.");
	}

}
