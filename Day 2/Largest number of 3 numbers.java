import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int n3 = sc.nextInt();
       
       if(n1>n2 && n1>n3)
       {
         System.out.println("Greatest is "+ n1);
       }
       else if (n2>n1 && n2>n3)
       {
         System.out.println("Greatest is "+ n2); 
       }
       else if(n1 == n2 && n2 == n3)
       {
         System.out.println("All are equal");
       }
       else
       {
         System.out.println("Greatest is "+ n3);
       }
       
    }
}