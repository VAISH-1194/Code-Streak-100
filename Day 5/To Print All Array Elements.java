import java.util.*;

public class Main 
{
  public static void print(int arr[],int n)
  {
    if(n<=0)
      return;
      
    print(arr,n-1); 
    
    System.out.print(arr[n - 1]+" ");
  }
  
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
      int n = sc.nextInt();
      
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
      
      print(arr,n);
  }
}