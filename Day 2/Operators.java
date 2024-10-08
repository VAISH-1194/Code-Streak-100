import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
      
      
      int m = 10, n = 5;
      int result = n++ + m * m++ + 5;
                // 5 + 10 * 10 + 5
      System.out.println(result);
      
      //////////////////////////////////
      
      int a = 10, b = 10;
      int c = a++;
      int d = ++b;
      
      System.out.println(a); // 11
      System.out.println(b); // 11
      System.out.println(c); // 10
      System.out.println(d); // 11
      
      /////////////////////////////////
      
      int a = 5;
      int x = a + a++ - 5;
          // 5 + 5 - 5
      System.out.println(x);
      
      int a = 5;
      int y = a++ + a - 5;
          // 5 + 6 - 5
      System.out.println(y);
      
      
      /////////////////////////////////
      
      System.out.println(-15>>3);
      System.out.println(-15>>>3);
    }
}