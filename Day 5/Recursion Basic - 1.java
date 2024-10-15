//Gives Output as "5 4 3 2 1"

import java.util.*;

public class Main {
  
  public static void hello(int n)
  {
    if(n<=0)
      return;
    System.out.print(n+" ");
    hello(n-1);
  }
    public static void main(String[] args) {
      hello(5);
  }
}


//Gives Output as "1 2 3 4 5"


import java.util.*;

public class Main {
  
  public static void hello(int n)
  {
    if(n<=0)
      return;
    hello(n-1);
    System.out.print(n+" ");
  }
    public static void main(String[] args) {
      hello(5);
  }
}