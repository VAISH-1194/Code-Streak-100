import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
      
        stack.push(11);
        stack.push(9);
        stack.push(2004);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
      
        System.out.println(stack);
    }
}