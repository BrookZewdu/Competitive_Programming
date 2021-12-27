class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int bool = 0;
        Stack<Integer> stk = new Stack<>();
        int j = 0; int i = 0;
       
        while(j < popped.length){
             if(!stk.isEmpty() && i < pushed.length && popped[j] == stk.peek() ){
                stk.pop();
                j++;
                continue;
            }
            if(i < pushed.length && pushed[i] != popped[j]){
                stk.push(pushed[i]);
                i++;
                continue;
            }
            
            if(i < pushed.length && pushed[i] == popped[j]){
                stk.push(pushed[i]);
                stk.pop();
                i++;
                j++;
                continue;
            }
           
            if(i == pushed.length && popped[j] == stk.peek()){
                stk.pop();
                j++;
                continue;
            }
            if(j < popped.length && i == pushed.length && popped[j] != stk.peek()){
                break;
            }
        }
        if(stk.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}