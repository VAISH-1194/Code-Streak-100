Method 1 - Optimised


class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
}



Method 2


class Solution
{
    public String reverseWords(String s)
    {
        String words[] = s.trim().split("\s+");
        int n = words.length;

        for(int i=0 ;i<n/2;i++)
        {
            String temp = words[i];
            words[i] = words[n-i-1];
            words[n-i-1] = temp;
        }

        return String.join(" ",words);
    }
}