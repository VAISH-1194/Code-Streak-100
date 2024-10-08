import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int x = 0;
      
      while(n-- != 0)
      {
        String s = sc.next();
        switch(s)
        {
          case "++X": ++x; break;
          case "--X": --x; break;
          case "X++": x++; break;
          case "X--": x--; break;
        }
      }
      
      System.out.println(x);
  }
}