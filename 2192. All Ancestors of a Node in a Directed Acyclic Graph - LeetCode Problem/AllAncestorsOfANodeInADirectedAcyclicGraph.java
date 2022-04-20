class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        Set<Integer>[] ansNotYet = new TreeSet[n];
        int[] inDegree = new int[n];
        
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            adjList.putIfAbsent(from, new ArrayList<>());
            adjList.get(from).add(to);
            inDegree[to]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ansNotYet[i] = new TreeSet<>();
            if (inDegree[i] == 0)
                queue.add(i);
        }
        
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            List<Integer> kids = adjList.get(curr);
            if (kids == null) continue;
            for (Integer kid : kids) {
                ansNotYet[kid].add(curr);
                ansNotYet[kid].addAll(ansNotYet[curr]);
                if (--inDegree[kid] == 0)
                    queue.offer(kid);
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (Set<Integer> ancestor : ansNotYet) {
            result.add(new ArrayList<>(ancestor));
        }
        return result;
    }
}