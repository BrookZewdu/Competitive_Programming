class Solution {
    private List<Integer> adjList[];
    private int[] status;
    private final int UNVISITED = 0, VISITING = 1, VISITED = 2;
    
    public boolean canFinish(int n, int[][] pq) {
        this.adjList = new List[n];
        this.status = new int[n];
        
        for (int i = 0; i < n; i++) 
            adjList[i] = new ArrayList<>();
        
        for (int[] courses : pq) {
            int course = courses[0], preq = courses[1];
            
            adjList[preq].add(course);
        }
        
        for (int i = 0; i < n; i++) {
            if (status[i] != VISITED && hasCycle(i))
                return false;
        }
        return true;
    }
    
    private boolean hasCycle (int idx) {
        if (status[idx] == VISITING)
            return true;
        
        status[idx] = VISITING;
        
        var list = adjList[idx];
        if (list != null) {
            for (Integer course : list) {
                if (status[course] != VISITED)
                    if (hasCycle(course))
                        return true;
            }
        }
        
        status[idx] = VISITED;
        return false;
    }
}