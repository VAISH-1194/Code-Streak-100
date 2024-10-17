import java.util.*;

public class Main {
  
    public static void cSort(int arr[], int place)
    {
      int n = arr.length;
      int output[] = new int[n];
      int count[] = new int[10];
      
      for(int i=0;i<n;i++)
      {
        int index = (arr[i] / place) % 10;
        count[index]++;
      }
      
      for(int i=1;i<10;i++)
        count[i] += count[i-1];
      for(int i=n-1; i>=0; i--)
      {
        int index = (arr[i] / place) % 10;
        output[count[index]-1] = arr[i];
        count[index]--;
      }
      for(int i=0;i<n;i++)
        arr[i] = output[i];
    }
    public static void radixSort(int arr[], int n)
    {
      int maxEle = arrMax(arr);
      for(int place = 1; maxEle/place > 0; place *= 10)
        cSort(arr,place);
    }
    public static int arrMax(int arr[])
    {
      int max = arr[0];
      for(int i=1;i<arr.length;i++)
        if(arr[i]>max)
          max = arr[i];
      return max;
    }
    public static void main(String[] args) {
      int arr[] = {2, 43, 1, 9, 456, 867, 452, 3, 57, 86};
      int n = arr.length;
      radixSort(arr,n);
      for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");
  }
}