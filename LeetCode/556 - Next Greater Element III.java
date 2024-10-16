Question

https://leetcode.com/problems/next-greater-element-iii/description/


Answer

import java.util.Scanner;

public class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        if (i == -1) {
            return -1;
        }
        
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        swap(digits, i, j);
        reverse(digits, i + 1);
        
        long result = Long.parseLong(new String(digits));
        
        return (result <= Integer.MAX_VALUE) ? (int) result : -1;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(char[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.nextGreaterElement(n);
        
        if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }

        scanner.close();
    }
}
