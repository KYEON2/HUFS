import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();
      StringBuffer sb = new StringBuffer(str);
      sb.reverse();
      
      if(str.contentEquals(sb)){
         System.out.printf("%s 은/는 회문입니다.",str);
      }
      else{
         System.out.printf("%s 은/는 회문이 아닙니다.",str);
      }
   }
}