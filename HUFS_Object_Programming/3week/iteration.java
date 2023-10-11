import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unit = {50000, 10000, 1000, 100, 10, 1};
		Scanner scanner = new Scanner(System.in);
		int a=0; int b=0; int c=0; int d=0; int e=0; int f=0;
		
		int n = scanner.nextInt();

		do {
			if (n >= 50000) {
			n -= 50000;
			a +=1;
		}
			
			else if (n < 50000 && n >= 10000) {
			n -= 10000;
			b += 1;
		}

			else if (n < 10000 && n >= 1000) {
			n -= 1000;
			c += 1;
		}
			
			else if (n < 1000 && n >= 100) {
			n -= 100;
			d += 1;
		}

			else if (n <100 && n >= 10 ) {
			n -= 10;
			e += 1;
		}

			else  if ( n<10 && n >= 1) {
			n -= 1;
			f += 1;
			}
			
		} while (n != 0);
		
		System.out.println("50000원 짜리 "+ a +"개");
		System.out.println("10000원 짜리 "+ b +"개");
		System.out.println("1000원 짜리 "+ c +"개");
		System.out.println("100원 짜리 "+ d +"개");
		System.out.println("10원 짜리 "+ e +"개");
		System.out.println("1원 짜리 "+ f +"개");
	}
}