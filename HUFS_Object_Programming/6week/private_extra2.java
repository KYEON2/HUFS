import java.io.*;
import java.util.*;

class Result {
	private int result = 0;
	private int point_A = 0;
	private int point_B = 0;

	public void updateIndex_A(int [] A){
		int tmp = 0;
		for (int i =0; i<A.length -1; i++){
			for (int j = 0; j<A.length - i -1; j++){
				if(A[j]>A[j+1]){
					tmp = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
				}
			}
		}
	}
	
	public void updateIndex_B(int [] B){
		int tmp = 0;
		for (int i =0; i<B.length -1; i++){
			for (int j = 0; j<B.length - i -1; j++){
				if(B[j]>B[j+1]){
					tmp = B[j];
					B[j] = B[j+1];
					B[j+1] = tmp;
				}
			}
		}
	}

	
	public int updateResult(int[] A, int[] B){
		int a = A.length -1;
		int b = B.length -1;
		
		while (true){
			if(A[a] < B[b]){
				a--;
				b--;
				this.result ++;
			}
			else {
				a--;
			}
			
			if (a <0 || b <0){
				break;
			}
		}
		return result;
	}
	
	public int getPoint_A(int i){
		if ( i >=0 && i < point_A){
			return point_A;
		}else {
			return -1;
		}
	}
	
	public int getPoint_B(int j){
		if ( j >=0 && j < point_B){
			return point_B;
		}else {
			return -1;
		}
	}
	
	public int getResult(){
		return result;
	}
}

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		String command = null;
		
		Result re = new Result();
		// 모든 함수를 완성하고 다른 함수는 필요하면 사용하되 getResult() 함수는 필수로 사용해야 함.
		// private 변수 활용 필수
		String input1 = scanner.nextLine();
		String[] part1 = input1.split(" ");
		int [] scores1 = new int[part1.length];
		for(int i = 0; i < part1.length; i++) {
			scores1[i]= Integer.parseInt(part1[i]);
		}
		
		String input2 = scanner.nextLine();
		String[] part2 = input2.split(" ");
		int [] scores2 = new int[part2.length];
		for(int i = 0; i < part2.length; i++) {
			scores2[i] = Integer.parseInt(part2[i]);
		}
		
		re.updateIndex_A(scores1);
		re.updateIndex_B(scores2);
		re.updateResult(scores1, scores2);
		
		
		int final_result = re.getResult();
		System.out.println(final_result);
		
	}
}