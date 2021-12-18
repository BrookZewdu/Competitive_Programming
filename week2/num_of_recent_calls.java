class RecentCounter {
    private int counter;
    Queue<Integer> calls = new LinkedList<Integer>();
    public RecentCounter() {
        counter = 0;
    }
    
    public int ping(int t) {
        calls.add(t);
        counter = 0;
        int org_size = calls.size();
        for(int i = 0; i < a; i++){
            if(calls.peek() < (t-3000)){
                    calls.poll();
                }
            }
            
        return calls.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */