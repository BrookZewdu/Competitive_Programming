class MyQueue {
    
    Stack<Integer> stk;
    Stack<Integer> stk2;
    public MyQueue() {
        stk  = new Stack<Integer>();
         stk2  = new Stack<Integer>();
    }
    
    public void push(int x) {
        int size = stk2.size();
        for(int i = 0; i < size; i++){
            stk.push(stk2.pop());
        }
        stk.push(x);
    }
    
    public int pop() {
        int size = stk.size();
        for(int i = 0; i < size; i++){
            stk2.push(stk.pop());
        }
        return stk2.pop();
    }
    
    public int peek() {
        int size = stk.size();
        for(int i = 0; i < size; i++){
            stk2.push(stk.pop());
           
        }
        return stk2.peek();
    }
    
    public boolean empty() {
        if(stk2.isEmpty() && stk.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */