import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception {
      
     BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
     String s=input.readLine();
     StringBuffer res=new StringBuffer();
     for(Character c:s.toCharArray())
     {
       int n=res.length();
       if(n==0)
       res.append(c);
       else if(res.charAt(n-1) !=c)
       res.append(c);
       
     }
     System.out.print(res);
  }
}