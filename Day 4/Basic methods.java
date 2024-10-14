import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
      String n1 = "Mukesh";
      String n2 = "Mukesh";
      
      System.out.println(n1.equals(n2));  //true
      
      // #Overridden 
      
      System.out.println();
      
      StringBuffer s1 = new StringBuffer("Gopi");
      StringBuffer s2 = new StringBuffer("Gopi");
      
      System.out.println(s1.equals(s2));  //false
      
      // Compares memories - chekcs for references
      
      System.out.println();
      
      String myStr1 = "Hello";
      String myStr2 = "HELLO";
      String myStr3 = "Another String";
      System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
      System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
      
      // This method ignore the case differences and compares the string
      
      System.out.println();
      
      String myStr4 = "Hello";
      String myStr5 = "";
      System.out.println(myStr4.isEmpty());
      System.out.println(myStr5.isEmpty());
      
      // This method checks whether a string is empty or not.
      
      System.out.println();
      
      String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      System.out.println(txt.length());

      // This method returns the length of a specified string.
      
      System.out.println();
      
      String myStr = "Hello";
      System.out.println(myStr.replace('l', 'p'));
      
      // This method searches a string for a specified character, and returns a new 
      // string where the specified character(s) are replaced.
      
      System.out.println();
      
      String myStr8 = "Hello, World!";
      System.out.println(myStr8.substring(7, 12));
      
      // This method returns a substring from the string. If the end argument is not 
      // specified then the substring will end at the end of the string
      
      System.out.println();
      
      String myStr6 = "Hello planet earth, you are a great planet.";
      System.out.println(myStr6.indexOf("planet"));
      
      // This method returns the position of the first occurrence of specified 
      // character(s) in a string.
      
      
      System.out.println();
      
      String myStr7 = "Hello planet earth, you are a great planet.";
      System.out.println(myStr7.lastIndexOf("planet"));
      
      // This method returns the position of the last occurrence of specified 
      // character(s) in a string
      
      System.out.println();
      
      
      String txt1 = "Hello World";
      System.out.println(txt1.toUpperCase());
      System.out.println(txt1.toLowerCase());
      
      // This method converts a string to upper case letters
      
      System.out.println();
      
      
      String txt2 = "Hello World";
      System.out.println(txt2.toUpperCase());
      System.out.println(txt2.toLowerCase());
      
      
      // This method converts a string to lower case letters
      
      System.out.println();
  }
}