import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,1,0,1,1,1};
      int max = 0, count=0;
      
      for(int ele: arr)
      {
        if(ele == 1)
          count++;
        else
          count = 0;
        if(max<count)
          max = count;
      }
      
      System.out.println(max);
  }
}