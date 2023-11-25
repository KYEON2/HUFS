import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		LinkedList 선언: LinkedList<Integer> list = new LinkedList<>();
		- 0보다 크고, 1000000보다 작은 숫자를 입력받아 LinkedList에 저장한다.
		- -1이 입력되면 입력을 종료한다. 이때 -2, -3 등 -1보다 작은 수가 입력될 수도 있다.
		- 프로그램이 종료되면 LinkedList의 모든 요소를 역순으로 출력한다.
		*/
		
		LinkedList<Integer> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		
		while ((n = scanner.nextInt()) != -1){
			
			
			
			if ( n <= 0){
				System.out.println("0보다 큰 숫자를 입력하세요.");
				continue;
			}
			else if (n>=1000000){
				System.out.println("1000000보다 작은 숫자를 입력하세요.");
				continue;
			}
			
			list.add(n);
		}
		
		Collections.reverse(list);
		
		System.out.println("Reversed list: " + list);
		
		
	}
}



    /*for(Integer num : list){
		System.out.println(num);
	}
    list를 
    30
    20
    10
    으로 출력하는 방법
    */