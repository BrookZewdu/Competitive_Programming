class MinStack {
    private int top;
    private int size;
    private ArrayList<Integer> arr = new ArrayList<Integer>();;
    public MinStack() {
        
        top = -1;
    }
    
    public void push(int val) {
        
        arr.add(val);
        ++top;
    }
    
    public void pop() {
        if(arr.isEmpty()){
            System.out.println("Stack empty");
            System.exit(1);
        }
        System.out.println(arr.get(top--));
        arr.remove(top+1);
    }
    
    public int top() {
        if(top == -1){
            System.out.println("Stack empty");
            System.exit(1);
        }
        return arr.get(top);
    }
    
    public int getMin() {
        ArrayList<Integer> sorted = new ArrayList<Integer>(arr);
        Collections.copy(sorted,arr);
        Collections.sort(sorted);
        
        return sorted.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */