class Solution {
    public int evalRPN(String[] tokens) {
        int a, b;
        int result;
        Stack<String> stk = new Stack<String>();
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stk.push(tokens[i]);
            }
            if(tokens[i].equals("+")){
                if(!stk.isEmpty()){
                    a = Integer.parseInt(stk.pop());
                    b = Integer.parseInt(stk.pop());
                    stk.push(Integer.toString(b + a));
                }
            }else if(tokens[i].equals("-")){
                if(!stk.isEmpty()){
                    a = Integer.parseInt(stk.pop());
                    b = Integer.parseInt(stk.pop());
                   stk.push(Integer.toString(b - a));
                }
            }else if(tokens[i].equals("*")){
                if(!stk.isEmpty()){
                    a = Integer.parseInt(stk.pop());
                    b = Integer.parseInt(stk.pop());
                    System.out.println(b);
                    stk.push(Integer.toString(b * a));
                }
            }else if(tokens[i].equals("/")){
                if(!stk.isEmpty()){
                    a = Integer.parseInt(stk.pop());
                    b = Integer.parseInt(stk.pop());       
                    stk.push(Integer.toString(b / a));
                }
            }
        }
        if(!stk.isEmpty()){
            result = Integer.parseInt(stk.pop());
            return result;
        }else{
            return -1;
        }

    }
}