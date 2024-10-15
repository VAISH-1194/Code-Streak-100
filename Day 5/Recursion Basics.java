import java.util.*;

public class Main {
  
  public static void hello(int n)
  {
    if(n<=0)
      return;
    System.out.println("Vaish");
    hello(n-1);
  }
  
  public static void main(String[] args) 
  {
    hello(5);
  }
}