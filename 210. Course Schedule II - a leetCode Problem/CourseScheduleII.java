class Solution {
    private List<Integer> adjList[];
    private int[] result;
    private int[] status;
    private int index;
    private final int UNVISITED = 0, VISITING = 1, VISITED = 2;
    
    public int[] findOrder(int n, int[][] pq) {
        this.index = n;
        this.adjList = new List[n];
        this.result = new int[n];
        this.status = new int[n];
        
        for (int i = 0; i < n; i++) 
            adjList[i] = new ArrayList<>();
        
        for (int[] courses : pq) {
            int course = courses[0], preq = courses[1];
            
            adjList[preq].add(course);
        }
        
        for (int i = 0; i < n; i++) {
            if (status[i] == UNVISITED && hasCycle(i))
                return new int[]{};
        }
        return result;
    }
    
    private boolean hasCycle (int currCourse) {
        if (status[currCourse] == VISITING)
            return true;
        status[currCourse] = VISITING;
        
        var list = adjList[currCourse];
        if (list != null) {
            for (Integer course : list) {
                if (status[course] != VISITED && hasCycle(course))
                    return true;
            }
        }
        
        status[currCourse] = VISITED;
        result[--index] = currCourse;
        return false;
    }
}