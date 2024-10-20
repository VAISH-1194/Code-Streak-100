class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stk = new Stack<>(); 

        for (char c : expression.toCharArray()) {
            if (c != ')' && c != ',') stk.push(c);
            else if (c == ')') { 
                ArrayList<Boolean> exp = new ArrayList<>();
            
                while (!stk.isEmpty() && stk.peek() != '(') {
                    char t = stk.pop();
                    if (t == 't') exp.add(true);
                    else exp.add(false);
                }
                
                stk.pop(); 
                
                if (!stk.isEmpty()) {
                    char t = stk.pop(); 
                    boolean v = exp.get(0);  
                    
                    if (t == '&') { 
                        for (boolean b : exp) v &= b;
                    } else if (t == '|') {
                        for (boolean b : exp) v |= b;
                    } else { 
                        v = !v;
                    }
                    
                    if (v) stk.push('t');
                    else stk.push('f');
                }
            }
        }

        return stk.peek() == 't';
    }
}