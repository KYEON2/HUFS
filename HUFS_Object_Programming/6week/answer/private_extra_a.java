import java.io.*;
import java.util.*;

class Result {
    private int point_A = 0;
    private int point_B = 0;
    private int result = 0;

    public void updateIndex_A(){
        point_A++;
    }

    public void updateIndex_B(){
        point_B++;
    }

    public void updateResult(){
        result++;
    }

    public int getPoint_A(){
        return point_A;
    }

    public int getPoint_B(){
        return point_B;
    }

    public int getResult(){
        return result;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();

        String [] str1 = scanner.nextLine().split(" ");
        String [] str2 = scanner.nextLine().split(" ");
        int [] A = new int[str1.length];
        int [] B = new int[str2.length];

        for (int i = 0; i < str1.length; i++) {
            A[i] = Integer.parseInt(str1[i]);
            B[i] = Integer.parseInt(str2[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++){
            int aPoint = result.getPoint_A();
            int bPoint = result.getPoint_B();
            if (A[aPoint] > B[bPoint]){
                result.updateIndax_B();
            }
            else if(A[aPoint] == B[bPoint]){
                result.updateIndex_B();
            }
            else {
                result.updateIndex_A();
                result.updateIndex_B();
                result.updateResult();
            }
        }

        System.out.printf("%d", result.getResult());
    }
}