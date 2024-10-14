import java.util.*;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
      String s = scan.next();
      int t = scan.nextInt();
      int temp = t;
      
      StringBuffer ana = new StringBuffer();
      int n = s.length();
      while(temp-- != 0)
      {
        char c = scan.next().charAt(0);
        int mag = scan.nextInt();
        int index = mag % n;
        
        if(c== '1' || c == 'L')
          ana.append(s.charAt(index));
        else if(c== 'r' || c == 'R')
          ana.append(s.charAt(n - index));
      }
      char c[] = String.valueOf(ana).toCharArray();
      Arrays.sort(c);
      boolean res = false;
      for(int i=0; i<n-t; i++) 
      {
        char e[] = s.substring(i,i+3).toCharArray(); if(String.valueOf(c).equals(String.valueOf(e)))
        res = true;
      }
    System.out.println(res? "YES" : "NO");
  }
}