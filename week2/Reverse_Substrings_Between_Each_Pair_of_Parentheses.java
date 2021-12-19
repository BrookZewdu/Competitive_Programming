class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stk = new Stack<String>();
        Stack<String> stk2 = new Stack<String>();
        Stack<String> stk3 = new Stack<String>();
        String arr[] = s.split("");
        for(int i = 0; i < arr.length; i++){
            stk.push(arr[i]);
            if(stk.peek().equals(")")){
                while(!stk.peek().equals("(")){
                    stk2.push(stk.pop());
                }
                
                stk.pop();
                
                int size = stk2.size();
                for(int j = 0; j < size-1; j++){
                    stk3.push(stk2.pop());
                }
                
                stk2.pop();
                
                int size2 = stk3.size();
                for(int k = 0; k < size2; k++){
                    stk.push(stk3.pop());
                } 
            }
        }
        
        String str = stk.toString();
        str = str.replaceAll("\\[", "").replaceAll("\\]","").replaceAll(",","").replaceAll(" ","");
        return str;
    }
}