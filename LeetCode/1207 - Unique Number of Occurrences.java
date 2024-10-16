Question

https://leetcode.com/problems/unique-number-of-occurrences/

Answer

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int freq[] = new int[2001];
        int o = 1000;
        for(int ele:arr)
            freq[ele + o]++;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<2001; i++)
        {
            if(freq[i] == 0)
                continue;
            if(set.contains(freq[i]))
                return false;
            set.add(freq[i]);
        }
        return true;
    }
}