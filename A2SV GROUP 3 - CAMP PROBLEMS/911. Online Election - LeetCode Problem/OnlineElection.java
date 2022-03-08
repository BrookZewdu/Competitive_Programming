class TopVotedCandidate {
    private int[] persons;
    private int[] times;
    private int[] res;
    HashMap<Integer, Integer> map;
    
    public TopVotedCandidate(int[] persons, int[] times) {
        this.persons = persons;
        this.times = times;
        this.map = new HashMap<>();
        this.res = new int[persons.length];
        helper();
    }
    
    private void helper(){
        int leader = 0;
        for(int i = 0; i < persons.length; i++){
            map.put(persons[i], map.getOrDefault(persons[i], 0) + 1);
            if(map.get(persons[i]) >= map.get(persons[leader])) leader = i;
            res[i] = persons[leader];
        }
    }
    
    public int q(int t) {
        int left = 0;
        int right = times.length - 1;
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(times[mid] <= t){
                left  = mid + 1;
                 // System.out.println(tim[mid]);
                ans = mid;
                // System.out.println(persons[ans] + " : " + times[ans]);
            }else if(times[mid] > t){
                right = mid - 1;
            }
        }
        
        return res[ans];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
                           /*
                            ["TopVotedCandidate","q"]
[[[0,0,0,0,1],[0,6,39,52,75]],[99]]
                           */