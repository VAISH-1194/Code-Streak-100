//Print Elements in the descending order


import java.util.*;

public class Main 
{
    static int count = 0;
    
    static Set<Integer> printed = new HashSet<>();

    public static void findFreq(int[] arr, int n) 
    {
        if (n <= 0) return;

        int currentElement = arr[n - 1];
        if (!printed.contains(currentElement)) 
        {
            count = 0;
            System.out.println(currentElement + " " + counter(currentElement, arr, arr.length));
            printed.add(currentElement); 
        }

        findFreq(arr, n - 1);
    }

    public static int counter(int ele, int[] arr, int n) 
    {
        if (n <= 0) 
        {
            return count;
        }

        if (ele == arr[n - 1])
            count++;

        return counter(ele, arr, n - 1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        
    
        int arr[] = new int[size];
        
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        findFreq(arr, arr.length);
    }
}



// Print Elements in the Ascending Order


import java.util.*;

public class Main {
    static Set<Integer> printed = new HashSet<>();

    public static void findFreq(int[] arr, int n, int index) {
        if (index >= n) return;

        int currentElement = arr[index];
        if (!printed.contains(currentElement)) {
            System.out.println(currentElement + " " + counter(currentElement, arr, n));
            printed.add(currentElement);
        }

        findFreq(arr, n, index + 1); 
    }

    
    public static int counter(int ele, int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
      
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        findFreq(arr, arr.length, 0);
    }
}

