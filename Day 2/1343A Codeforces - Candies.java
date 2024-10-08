Task:
For each test case, you're given a number n (the number of candy wrappers). 
You need to find any value of x such that there exists some k > 1 that 
satisfies the equation x * (2^k - 1) = n.

Solution Strategy:
-> Iterate over different values of k: For each value of k, compute the value 2^k - 1.
-> Check if 2^k - 1 divides n: If it divides n, compute x = n / (2^k - 1) and print x.
-> Stop once a valid x is found.
Since it’s guaranteed that a solution exists for each test case, you can confidently 
find a valid x by iterating through potential values of k.

Example Walkthrough:
Input 1:
1
3
Here, n = 3.

For k = 2, the sum is x * (2^2 - 1) = x * 3.
If n = 3, then x = 3 / 3 = 1.
The answer is 1.

Input 2:
2
7
15
For the first test case (n = 7):

For k = 3, the sum is x * (2^3 - 1) = x * 7.
If n = 7, then x = 7 / 7 = 1.
For the second test case (n = 15):

For k = 4, the sum is x * (2^4 - 1) = x * 15.
If n = 15, then x = 15 / 15 = 1.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int x = 0;
            
           
            for (int k = 2; ; k++) {
                int sum = (1 << k) - 1;
                
                if (n % sum == 0) {
                    x = n / sum;
                    break;
                }
            }
            
            System.out.println(x);
        }
        
        sc.close();
    }
}
