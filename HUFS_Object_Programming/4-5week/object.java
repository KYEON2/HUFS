import java.io.*;
import java.util.*;

public class Cat{
	String name; // 고양이 이름
	int age; // 고양이 나이
	int location; // 고양이 위치

	public Cat(){ // 고양이 생성자
		name = "cat"; age = 0; location = -1;
	}
	public Cat(String t, int n, int m){ // 고양이 생성자
		// 여기에 코드 작성
		name = t;
		age = n;
		location = m;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		Cat [] c = new Cat[3];
		// 여기에 코드 작성
		
		for (int i=0; i<c.length; i++){
			String input = scanner.nextLine();
			String[] parts = input.split(" ");
			String name = parts[0].trim();
			int age = Integer.parseInt(parts[1].trim());
			int location = Integer.parseInt(parts[2].trim());
			
			
			c[i] = new Cat(name, age, location);
		}
		
		
		if (c[0].location == c[1].location && c[1].location == c[2].location){
			System.out.print(c[2].name + " -1");
		}
		else{
			int a = c[1].location - c[0].location -1;
			int b = c[2].location - c[1].location - 1;
			if (a == b){
				System.out.print(c[2].name + " "+ b);
			}
			else if ( a > b){
				System.out.print(c[2].name + " "+ a);
			}
			else if ( a < b){
				System.out.print(c[0].name + " "+ b);
			}
		}
	}
}