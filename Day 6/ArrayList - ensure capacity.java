import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(10);
        list.add(11);
        list.add(9);
        list.add(2004);
        list.add(20);

        int sum = 0;

        for (int ele : list)
            sum += ele;

        System.out.println(sum);
        System.out.println(list.size());
    }
}