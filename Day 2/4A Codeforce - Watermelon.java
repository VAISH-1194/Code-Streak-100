import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      if(n%2==0 && n>=4)
      {
          System.out.println("YES");
      }
      
      else
      {
        System.out.println("NO");
      }
  }
}