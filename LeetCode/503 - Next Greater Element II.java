Question

https://leetcode.com/problems/next-greater-element-ii/


Answer

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int n= nums.length;
        Arrays.fill(res,-1);
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<2*nums.length;i++)
        {
            while(!s.isEmpty() && nums[i%n]>nums[s.peek()])
            {
                res[s.pop()] = nums[i%n];
            }
            s.push(i%n);
        }
        return res;

    }
}