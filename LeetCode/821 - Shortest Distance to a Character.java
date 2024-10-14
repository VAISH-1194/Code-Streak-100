Question 

https://leetcode.com/problems/shortest-distance-to-a-character/


// Method 1


class Solution {
    public int[] shortestToChar(String s, char c) {
          int n=s.length();
          int min=Integer.MAX_VALUE;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
             char ch=s.charAt(j);
             if(ch==c){
                int a=Math.abs(i-j);
                min= Math.min(min,a);}
            }
            arr[i]=min;
            }
            return arr;
    }
}


// Optimised Method 2


class Solution
{
    public int[] shortestToChar(String s, char c)
    {
        int n = s.length();
        int res[] = new int[n];
        int k=0, last = 10000000;

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == c)
            {
                res[k++] = 0;
                last = i;
            }
            else
            {
                int j = i;
                while(j<n && s.charAt(j) != c)
                    j++;
                if(j<n)
                    res[k++] = Math.min(Math.abs(i-j),Math.abs(i-last));
                else
                    res[k++] = Math.abs(i-last);
            }
        }

        return res;
    }
}