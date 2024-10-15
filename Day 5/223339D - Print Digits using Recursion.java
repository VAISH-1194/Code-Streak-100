import java.util.Scanner;

public class PrintDigits 
{
  public static void printDigits(int n) 
  {
    if (n < 10) 
    {
       System.out.print(n);
    } 
    else 
    {
      printDigits(n / 10);
      System.out.print(" " + n % 10); 
    }
  }

public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
          
    int T = sc.nextInt();
  
    for (int i = 0; i < T; i++) 
    {
      int N = sc.nextInt();
           
      if (N == 0) 
      {
        System.out.println(0);
      } 
      
      else 
      {
        printDigits(N);
        System.out.println(); 
      }
    }
  }
}
