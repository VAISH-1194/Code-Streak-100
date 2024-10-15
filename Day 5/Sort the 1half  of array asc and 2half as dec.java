import java.util.Arrays;
import java.util.*;

public class Main 
{
    public static void sortFirstHalf(int[] arr, int start, int mid) 
    {
        if (mid - start <= 1) return;
        Arrays.sort(arr, start, mid);
    }

    public static void sortSecondHalf(int[] arr, int mid, int end) 
    {
        if (end - mid <= 1) return;
        Arrays.sort(arr, mid, end);
        reverse(arr, mid, end);
    }

    public static void reverse(int[] arr, int start, int end) 
    {
        int left = start, right = end - 1;
        while (left < right) 
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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
        
        int mid = n / 2;
        sortFirstHalf(arr, 0, mid);
        sortSecondHalf(arr, mid, arr.length);
        for(int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}