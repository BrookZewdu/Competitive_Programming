class MyCircularDeque {
    private int k;
    Deque<Integer> myDQ;
    public MyCircularDeque(int k) {
        this.k = k;
        myDQ = new LinkedList<>();
        
    }
    
    public boolean insertFront(int value) {
        if(isFull() == false){
            myDQ.addFirst(value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(isFull() == false){
            myDQ.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(isEmpty() == false){
            myDQ.removeFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(isEmpty() == false){
            myDQ.removeLast();
            return true;
        }
        return false;
    }
    
    public int getFront() {
        if(isEmpty() == false){
            return myDQ.getFirst();
        }
        return -1;
    }
    
    public int getRear() {
        if(isEmpty() == false){
            return myDQ.getLast();
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(myDQ.isEmpty()){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(myDQ.size() == this.k){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */