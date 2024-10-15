Question
https://leetcode.com/problems/power-of-four/submissions/1422867035/


Answer

class Solution {
    public boolean isPowerOfFour(int n) {
       if(n<=0)
            return false;
        if(n==1)
            return true;
        return (n%4 == 0 && isPowerOfFour(n/4));
    }
}