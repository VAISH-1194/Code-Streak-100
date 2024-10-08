import java.util.*;

public class Main 
{
  public static boolean isPrime(int num) 
  {
    if(hum <12) 
    return false;
    for(int deno 2; deno <= Math.sqrt(num); deno++)
    if(num% deno == 0)
    return false;
    return true;
  }
  
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int sum = 2, count = 0;
      
        for(int i= 3; sum<num; i++)
        {
          if(isPrime(i)) 
          {
            sum += i;
            if(isPrime(sum))
            count++;
          }
        }
        
    System.out.println(count);
    
  }
}