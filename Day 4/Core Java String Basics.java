import java.util.*;

public class Main {
    public static void main(String[] args) {
     
     String name1 = "Vaish";
     String lname = "Navi";
     String name2 = "Madhav";
     
     System.out.println(name1.charAt(2));
     System.out.println(name1+lname);
     
     
    // More optimised solution than name1 + lname
     
     StringBuffer name3 = new StringBuffer ("Vish");
     StringBuffer name4 = new StringBuffer ("Kumar");
     
     name3.append(name4);
     
     System.out.println(name3);
  }
}