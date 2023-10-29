import java.io.*;
import java.util.*;

public class Cat{
    String name; // 고양이 이름
    int age; // 고양이 나이
    int location // 고양이 위치

    public Cat(){
        name = "cat"; age = 0; location = -1;
    }

    public Cat(String t, int n, int m){
        name = t; age =n; location =m;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Cat [] c = new Cat[3];
        for (int i=0; i<c.length; i++){
            String name = scanner.next();
            int age =  scanner.nextInt();
            int loc = scanner.nextInt();

            c[i] = new Cat(name, age, loc);
        }
        if (c[1].location - c[0].location >= c[2].location - c[1].location){
            System.out.printf("%s %d", c[2].name, c[1].location - c[0].location -1);
        }
        else {
            System.out.printf("%s %d", c[0].name, c[2].location - c[1].location -1);
        }
    }
}