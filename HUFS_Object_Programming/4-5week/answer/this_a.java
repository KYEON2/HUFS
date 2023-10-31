import java.io.*;
import java.util.*;

public class Car{
    String carName;
    int carYear;
    int maxSpeed;
    String carColor;

    public Car(){
        carName = "car"; carYear = 0; maxSpeed = 0; carColor = "black";
    }

    public Car(String carName, int carYear, int maxSpeed, String carColor){
        this.carName = carName; this.carYear = carYear; this.maxSpeed = maxSpeed; this.carColor = carColor;
    }

    public String getCarName(){
        return carName;
    }

    public int getCarYear(){
        return carYear;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String getCarColor(){
        return carColor;
    }

    public void setMaxSpeed(iint maxSpeed){
        this.maxSpeed += maxSpeed;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Car [] c = new Car[5];
        int count = 0;
        String command = null;
        
        for (int i = 0; i<c.length; i++){
            c[i] = new Car();
        }

        while (true) {
            command = scanner.next();
            if (command.equals("new")){
                String name = scanner.next();
                int year = scanner.nextInt();
                int speed = scanner.nextInt();
                String color = scanner.next();

                c[count] = new Car(name, year, speed, color);
                count += 1;

                if (count == 5) break;
            } else if(command.equals("setspeed")){
                int id = scanner.nextInt();
                int new_speed = scanner.nextInt();
                c[id].setMaxSpeed(new_speed);
            } else if (command.equals("quit")) break;
        }

        for (int i = 0; i<c.length; i++){
            System.out.printf("%d년 된 %s 차량의 최고 속도는 %d 입니다\n", c[i].getCarYear(), c[i].getCarColor(), c[i].getCarName(), c[i].getMaxSpeed());
        }
    }
}