import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args){
        int [] unit = { 50000, 10000, 1000, 100, 10, 1};

        Scanner scanner = new Scanner(System.in);
        
        int num1 = 0; int num2 = 0; int sum = 0; int sub = 0; int mul = 0; int div = 0;

        while(true) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            sum = sum(num1, num2);
            sub = sub(num1, num2);
            mul = mul(num1, num2);
            try {
                div = div(num1, num2);
                break;
            }
            catch (ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
            }
        }

        System.out.println(num1 + " + " +num2 +" = " +sum);
        System.out.println(num1 + " - " +num2 +" = " +sub);
        System.out.println(num1 + " * " +num2 +" = " +mul);
        System.out.println(num1 + " / " +num2 +" = " +div);
    }
}