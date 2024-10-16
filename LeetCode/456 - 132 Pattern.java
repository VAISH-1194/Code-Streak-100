Question

https://leetcode.com/problems/132-pattern/

Answer

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int mid = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0 ; i--)
        {
            int n = nums[i];
            if(mid > n)
                return true;
            while(!stack.isEmpty() && stack.peek() < n)
                mid = stack.pop();
            stack.push(n);
        }
        return false;
    }
}
