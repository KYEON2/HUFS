import java.io.*;
import java.util.*;

public class Main {
    public static int compare(int num1, int num2, int num3){
        int max = 0;
        max = ((num1 > num2) && (num1 > num3)) ? num1 : ((num2 > num1) && (num2 > num3)) ? num2 : num3;
        return max;
    }
}