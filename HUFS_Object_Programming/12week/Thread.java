import java.io.*;
import java.util.*;

public class PrimeNumberFinder implements Runnable {
	// 필요한 코드 작성. 주어진 뼈대 코드는 수정하지 말 것
	private int maxnum;
	
	public PrimeNumberFinder(int maxnum){
		this.maxnum = maxnum;
	}
	
	
	@Override
	public void run(){
		findPrimes(maxnum);
	}
	
	private boolean isPrime(int num){
		if(num <= 1){
			return false;
		}
		for (int i =2; i <= Math.sqrt(num); i++){
			if (num % i ==0){
				return false;
			}
		}
		return true;
	}

	private void findPrimes(int maxnum){
		for (int i = 2; i <= maxnum; i++){
			if(isPrime(i)){
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
	public static void main(String[] args) {
		// 메인 함수 작성
		Scanner scanner = new Scanner(System.in);
		int maxnum = scanner.nextInt();
		
		PrimeNumberFinder a = new PrimeNumberFinder(maxnum);
		new Thread(a).start();
	}
}
