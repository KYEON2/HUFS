import java.io.*;
import java.util.*;

class Calc {
    public static double abs(double a) {
        return a>0 ? a : -a;
    }
    public static double getArea(double radius){
        return Circle.PI * radius * radius;
    }
}

class Circle {
    public static final double PI = 3.14;
    String name;
    double radius;
    double area;

    public Circle() {
        name = "Circle"; radius = 0;
    }

    public Circle(String name, double radius) {
        this.name = name; 
        this.radius = radius;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        Circle [] c = new Circle[3];
        for (int i = 0; i < c.length; i++){
            c[i] = new Circle();
        }
        for(int i=0; i<c.length; i++){
            String name = scanner.next();
            if(name.equals("Circle")){
                double radius = Calc.abs(scanner.nextDouble());
                c[i] = new Circle(name, radius);
                c[i].area = Calc.getArea(radius);
            }
            else {
                break;
            }
        }
        for (int i=0; i<c.length; i++){
            System.out.printf("%s의 넓이: %.2f\n", c[i].name, c[i].area);
        }
    }
}