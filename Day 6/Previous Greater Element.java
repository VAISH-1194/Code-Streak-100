import java.util.*;

public class Main {
  
    public static void solution2(int arr[], int n)
    {
      Stack<Integer> stack = new Stack<>();
      // stack.push(arr[0]);
      for(int i=0;i<n;i++)
      {
        if(i==0)
        {
          System.out.print("-1 ");
          stack.push(arr[i]);
        }
        else
        {
          while(!stack.empty() && stack.peek() < arr[i])
            stack.pop();
          if(stack.empty())
            System.out.print("-1 ");
          else
            System.out.print(stack.peek() + " ");
          stack.push(arr[i]);
        }
      }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
      
      solution2(arr,n);
    }
}
