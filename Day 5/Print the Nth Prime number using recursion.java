import java.util.Scanner;

public class Main 
{
    public static boolean isPrime(int num, int divisor) 
    {
        if (num <= 2) 
        {
            return num == 2; 
        }
        if (num % divisor == 0) 
        {
            return false;
        }
        if (divisor * divisor > num) 
        {
            return true;
        }
        return isPrime(num, divisor + 1);
    }    
    
    public static int findNthPrime(int n, int currentNum, int primeCount) 
    {
        if (primeCount == n) 
        {
            return currentNum - 1; 
        }

        if (isPrime(currentNum, 2)) 
        {
            return findNthPrime(n, currentNum + 1, primeCount + 1); 
        } 
        else 
        {
            return findNthPrime(n, currentNum + 1, primeCount); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nthPrime = findNthPrime(n, 2, 0);

        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }
}
