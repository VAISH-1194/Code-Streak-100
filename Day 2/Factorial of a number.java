// Using For Loop

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long factorial = 1; 
        
        if (n == 0 || n == 1) {
            System.out.println("Factorial: 1");
        } 
        else 
        {
            for (int i = 2; i <= n; i++) 
            {
                factorial *= i;
            }
            
            System.out.println("Factorial: " + factorial);
        }
    }
}



// Using Recursion

import java.util.Scanner;

public class Main {

    public static long factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1; 
        } 
        else 
        {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println("Factorial: " + factorial(n));
    }
}
