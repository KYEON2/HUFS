import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("현재 월을 입력하세요. : ");
		int month = scanner.nextInt();
		
		String season = "겨울";
		String a = "현재 계절은 %s입니다.";
		
		switch (month){
			case 1,2,12:
				System.out.printf(a,season);
				break;
			case 3,4,5:
				season = "봄";
				System.out.printf(a,season);
				break;
			case 6,7,8:
				season = "여름";
				System.out.printf(a,season);
				break;
			case 9,10,11:
				season = "가을";
				System.out.printf(a,season);
				break;
			default:
				System.out.println("입력값이 잘못되었습니다.");
		}
	}
}