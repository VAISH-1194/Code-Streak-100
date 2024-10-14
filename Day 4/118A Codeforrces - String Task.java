import java.util.*;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
    String s = scan.next().toLowerCase();
    StringBuffer res = new StringBuffer();
    
    for(char c: s.toCharArray())
    {
      if(!(c=='a' ||c=='u'||c=='o' ||c=='i' ||c=='e' ||c=='y'))
      res.append("."+c);
    }
    
    System.out.println(res);
  }
}