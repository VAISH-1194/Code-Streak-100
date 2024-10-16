import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(9);
        list.add(2004);
        list.add(20);
        
        int sum = 0;
        
        for(int ele:list)
          sum += ele;
     
        System.out.println(sum);
     
    }
}
