import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args){
        int [] unit = { 50000, 10000, 1000, 100, 10, 1};

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int [ ] num = new int[6];

        for(int i = 0; i<6; i++){
            num[i] = amount / unit[i];
            amount = amount % unit[i];
        }

        System.out.printf("50000원 짜리 %d개\n",num[0]);
        System.out.printf("10000원 짜리 %d개\n",num[1]);
        System.out.printf("1000원 짜리 %d개\n",num[2]);
        System.out.printf("100원 짜리 %d개\n",num[3]);
        System.out.printf("10원 짜리 %d개\n",num[4]);
        System.out.printf("1원 짜리 %d개\n",num[5]);
    }
}