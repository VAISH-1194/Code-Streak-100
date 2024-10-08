import java.util.Scanner;

public class NearlyLuckyNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int luckyCount = 0;
        
        for (int i = 0; i < n.length(); i++) 
        {
            char digit = n.charAt(i);
            if (digit == '4' || digit == '7') 
            {
                luckyCount++;
            }
        }
        
        
        if (isLucky(luckyCount)) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }
    }
    
    public static boolean isLucky(int number) 
    {
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++) 
        {
            char digit = numberStr.charAt(i);
            if (digit != '4' && digit != '7') 
            {
                return false;
            }
        }
        
        return true;
    }
}
