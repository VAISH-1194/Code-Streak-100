Method 1 - Optimised

class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;

        while (i < version1.length() || j < version2.length()) {

            int num1 = 0, num2 = 0;
            while (i < version1.length() && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i++) - '0');
            }

            while (j < version2.length() && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j++) - '0');
            }
            
            if (num1 < num2) {
                return -1;
            }
            if (num1 > num2) {
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}



Method 2 

class Solution
{
    public int compareVersion(String version1, String version2)
    {
        var v1 = version1.split("\\.");
        var v2 = version2.split("\\.");
        var n = Math.max(v1.length, v2.length);

        for(var i=0;i<n;i++)
        {
            var n1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            var n2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if(n1 != n2) return n1 < n2 ? -1 : 1;
        }

        return 0;
    }
}