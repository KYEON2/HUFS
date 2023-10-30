import java.io.*;
import java.util.*;

public class Figure {
    String name;
    double radius;
    double length;
    double width;
    double area;

    public Figure(String name, double radius){
        this.name = name; this.radius = radius;
    }

    public Figure(String  name, double length, double width){
        this.name = name; this.length = length; this.width =width;
    }

    public void getArea(double radius) {
        this.area = 3.14 * radius * radius;
    }

    public void getArea(double length, double width){
        this.area = length * width;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        Figure [] f = new Figure[4];
        for(int i=0; i<f.length; i++){
            String name = scanner.next();
            if (name.equals("Circle")){
                double radius = scanner.nextDouble();
                f[i] = new Figure(name, radius);
                f[i].getArea(radius);
            }
            else {
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                f[i] = new Figure(name, length, width);
                f[i] = getArea(length, width);
            }
        }

        for(int i=0; i<f.length; i++){
            System.out.printf("%s의 넓이: %.2f\n", f[i].name, f[i].area);
        }
    }
}