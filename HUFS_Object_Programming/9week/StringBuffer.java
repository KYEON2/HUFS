import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sant = scanner.next();
		StringBuffer sb = new StringBuffer(sant);
		String value = "no";
		
		String sbreverse = sb.reverse().toString();
		if(sant.equals(sbreverse)){
				value = "true";
			}
		else {
			value = "false";
		}
		
		
		if(value.equals("true")){
			System.out.printf("%s 은/는 회문입니다.",sant);
		} else if(value.equals("false")){
			System.out.printf("%s 은/는 회문이 아닙니다." , sant);
		}
	}
}


