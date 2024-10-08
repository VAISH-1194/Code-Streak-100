Method 1


import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isPrime = true;

        if (n <= 1)
        {
            isPrime = false;
        } 
        
        else 
        {
            for (int i = 2; i * i <= n; i++) 
            {
                if (n % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) 
        {
            System.out.println("Prime");
        } 
        else 
        {
            System.out.println("Not Prime");
        }
    }
}





Optimized solution on finding primes - Method 2



import java.util.*;
public class Main 
{
  public static void main(String[] args) 
  {
  Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      boolean flag = true;
      
    for(int deno = 2; deno <= Math.sqrt(num); deno++)
      if(num % deno == 0) 
      {
        flag = false;
        break;
      
      }
    System.out.println(flag? "Prime" : "Not Prime"); 
    
  }
}