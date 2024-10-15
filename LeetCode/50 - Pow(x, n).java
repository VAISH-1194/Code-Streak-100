Question

https://leetcode.com/problems/powx-n/description/

Answer

class Solution {
    public double myPow(double x, int n) 
    {      
        double result = Math.pow(x, n);
        return result;  
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Solution solution = new Solution();
        
        double x = sc.nextDouble();
        int n = sc.nextInt();

        double result = solution.myPow(x, n);
        System.out.println(result);  
    }
}
