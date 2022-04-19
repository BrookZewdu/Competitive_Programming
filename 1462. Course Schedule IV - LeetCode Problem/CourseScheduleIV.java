class Solution {
    private List<Integer>[] adjList;
    private Map<String, Boolean> dp = new HashMap<>(); 
    private boolean DFS (int preq, int course) {
        if (preq == course) 
            return true;
        
        String key = preq + "-" + course;
        if(dp.containsKey(key))
            return dp.get(key);
        
        for(Integer courses : adjList[preq]) {
            if(DFS(courses, course)) {
                dp.put(key, true);
                return true;
            }
        }
        dp.put(key, false);
        return false;
    }
    
    public List<Boolean> checkIfPrerequisite
        (int N, int[][] pq, int[][] queries) {
        
        this.adjList = new ArrayList[N];
        List<Boolean> result = new ArrayList<>();
        
        for (int i = 0; i < N; i++) 
            adjList[i] = new ArrayList<>();
        
        for (int edge[] : pq) {
            int preq = edge[0], course = edge[1];
            adjList[preq].add(course);
        }
        
        for(int[] query : queries) {
            boolean ans = false;
            int preq = query[0], course = query[1];
            if (DFS(preq, course))
                ans = true;
            result.add(ans);
        }
        return result;
    }
}