import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		//n을 입력받기
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); int count = 0;
		
		ArrayList<String> names = new ArrayList<>();
		// while 문으로 저장 , 개수가 n 되면 실행 중지
		while(count < n){
			
			String con = scanner.next();
			if(con.equals("new")){
				String Last_name = scanner.next();
				count ++;
				names.add(Last_name);
			} else if(con.equals("set")){
				int num = scanner.nextInt();
				String Last_name = scanner.next();
				names.set(num, Last_name);
			}
			
			
		}
		
		
		//for 문 사용해서 출력
		for(int i=0; i<n; i++){
			System.out.print(names.get(i));
			System.out.println();
		}
	}
	
}
