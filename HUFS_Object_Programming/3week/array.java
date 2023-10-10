import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		int i_A[][];
		i_A = new int [5][];
		
		i_A[0] = new int[5];
		i_A[1] = new int[3];
		i_A[2] = new int[4];
		i_A[3] = new int[1];
		i_A[4] = new int[2];
		
		for (int i = 0; i< i_A.length; i++)
			for(int j = 0; j <i_A[i].length; j++)
				i_A[i][j] = (i+1)*10 +j;
		
		for (int i = 0; i < i_A.length; i++){
			for(int j = 0; j <i_A[i].length; j++)
				System.out.print(i_A[i][j]+ " ");
			System.out.println();
		}
	}
}