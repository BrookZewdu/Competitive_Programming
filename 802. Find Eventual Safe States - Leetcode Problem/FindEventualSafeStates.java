class Solution {
    private int[][] graph;
    private final int UNVISITED = 0, VISITING = 1, VISITED = 2;
    private int[] status;
    private List<Integer> result;
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        this.result = new ArrayList<>();
        int n = graph.length;
        this.status = new int[n];
        this.graph = graph;
        
        for (int i = 0; i < n; i++) {
            if(!hasCycle(i)){
                result.add(i);
            }
        }
        
        return result;
    }
    
    private boolean hasCycle (int index) {
        if (status[index] == VISITING)
            return true;
        if (status[index] == VISITED)
            return false;
        if (graph[index].length == 0) {
            status[index] = VISITED;
            return false;
        }
            
        status[index] = VISITING;
        
        for (Integer edge : graph[index]) {
            if (hasCycle(edge))
                return true;
        }
        
        status[index] = VISITED;
        return false;
    }
}