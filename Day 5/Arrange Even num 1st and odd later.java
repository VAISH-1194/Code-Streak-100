import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void arrangeEvenOdd(List<Integer> even, List<Integer> odd, int[] arr, int index) 
    {
        if (index == arr.length) 
        {
            return;
        }

        if (arr[index] % 2 == 0) 
        {
            even.add(arr[index]);
        } 
        
        else 
        {
            odd.add(arr[index]);
        }
        
        arrangeEvenOdd(even, odd, arr, index + 1);
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
        
        Arrays.sort(arr);
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        arrangeEvenOdd(even, odd, arr, 0);

        even.addAll(odd);
        
        for (Integer num : even) 
        {
            System.out.print(num + " ");
        }
    }
}
