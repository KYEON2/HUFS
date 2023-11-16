/*
n,S 를 입력받아 n개로 이루어진 부분집합 중 각 원소를 곱했을 때 가장 큰수가 되도록 하는 프로그램
2, 9 를 입력받으면 {4, 5}가 가장 큰 부분집합
*/ 

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // n 입력받기
		int S = scanner.nextInt(); // S 입력받기
		int [] ans;
		
		if (n > S) { // n이 S보다 크면 -1 반환
			ans = new int[] {-1}; 
			System.out.print(ans[0]);
		} else {
			ans = new int[n];
			
			int a = S/n; // 몫
			int b = S%n; // 나머지
			
			for(int i =0; i<n; i++){ // 몫으로 초기화
				ans[i] = a;
			}
			
			int k = n-1; int count = 0;
			while (count < b){ // n-1부터 1씩 더하기
				ans[k] += 1;
				count += 1;
				k -= 1;
			}
			
			for(int j = 0; j<n; j++){
				if(j>0){
					System.out.print(" ");
				}
				System.out.print(ans[j]);
			}
		}
	}
}
