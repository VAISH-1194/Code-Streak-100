import java.util.Scanner;

public class MinFlips 
{
    public static int minFlips(String str) 
    {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) != (i % 2 == 0 ? '0' : '1')) 
            {
                count1++;
            }
            
            if (str.charAt(i) != (i % 2 == 0 ? '1' : '0')) 
            {
                count2++;
            }
        }
        return Math.min(count1, count2);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int result = minFlips(str);
        System.out.println(result);
        scanner.close();
    }
}


// Alias 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
       String s = sc.next();
       
       int n = s.length();
       int fCount = 0, sCount = 0;
       
       for(int i=0;i<n;i++)
       {
         if(i%2==0 && s.charAt(i) != '0')
            fCount++;
         else if (i%2==1 && s.charAt(i) != '1')
            fCount++;
       }
       
       
       for(int i=0;i<n;i++)
       {
         if(i%2==0 && s.charAt(i) != '1')
            sCount++;
         else if(i%2==1 && s.charAt(i) != '0')
            sCount++;
       }
       
        System.out.println(Math.min(fCount, sCount));
        
    }
}
