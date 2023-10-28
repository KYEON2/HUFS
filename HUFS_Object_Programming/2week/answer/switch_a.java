import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int month = scanner.nextInt();

        String season = "겨울";
        String a = "현재 계절은 %s입니다";

        if(month > 0 && month<13){
            switch(month/3){
                case 1:
                    season = "봄";
                    break;
                case 2:
                    season = "여름";
                    break;
                case 3:
                    season = "가을";
                    break;
            }
            else{
                a = "입력값이 잘못되었습니다.";
            }
            System.out.printf(a, season);
        }
    }
}