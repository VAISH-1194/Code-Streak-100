Question

https://leetcode.com/problems/valid-parentheses/

Answer

class Solution {
    public boolean isValid(String s) {
        Stack<Character> checker = new Stack<Character>();

        for(Character c: s.toCharArray())
        {
            if(c=='{' || c=='(' || c == '[')
                checker.push(c);
            else if(!checker.empty())
            {
                if(c=='}' && checker.peek() == '{')
                    checker.pop();
                else if(c == ']' && checker.peek() == '[')
                    checker.pop();
                else if(c == ')' && checker.peek() == '(')
                    checker.pop();
                else
                    return false;
            }

            else return false;
        }

        return checker.empty() ? true : false;
    }
}