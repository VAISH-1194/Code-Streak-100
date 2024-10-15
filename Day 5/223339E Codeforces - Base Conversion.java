import java.util.Scanner;

public class Main 
{
    public static void Binary(int n) 
    {
        if (n == 0) 
        {
            return;
        }
        
        Binary(n / 2);
        System.out.print(n % 2);
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
                Binary(N);
                System.out.println();
            }
        }
    }
}
