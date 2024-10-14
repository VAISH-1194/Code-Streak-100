import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
      // Scanner sc = new Scanner(System.in);
      
      // String s = sc.nextLine();
      
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      String s = input.readLine();
      int count = 0;
      
      for(Character c:s.toCharArray())
      {
        if(Character.isDigit(c))
        {
          break;
        }
        else
        {
          count++;
        }
        
        System.out.println(count);
      }
  }
}