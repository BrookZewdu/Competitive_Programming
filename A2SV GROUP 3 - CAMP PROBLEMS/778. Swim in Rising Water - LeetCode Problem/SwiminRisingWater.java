class Solution {
    public int swimInWater(int[][] grid) {
        class inner implements Comparator<inner>{
            int time;
            int[] pos;
            public inner(int[] pos, int time){
                this.pos = pos;
                this.time = time;
            }
            public inner(){}
            @Override
            public int compare(inner o1, inner o2){
                return o1.time - o2.time;
            }
        }
        
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int n = grid[0].length;
        PriorityQueue<inner> minHeap = new PriorityQueue<>(new inner());
        HashSet<Integer> seen = new HashSet<>();
        // Queue<inner> minHeap = new LinkedList<>();
        minHeap.add(new inner(new int[]{0,0}, grid[0][0]));
        seen.add(0);
        int ans = grid[0][0];
        int row = grid.length - 1, col = grid[0].length - 1;
        while(!minHeap.isEmpty()){
            
            int[] pos = minHeap.peek().pos;
            int time = minHeap.poll().time;
            // System.out.println("row: " + pos[0] + ", col: " + pos[1] + ", time: " + time);
            if(pos[0] == row && pos[1] == col){
                // System.out.println("huh");
                return time;
            }
            
            for(int[] direction : dirs){
                int new_r = pos[0] + direction[0];
                int new_c = pos[1] + direction[1];
                
                if(0 <= new_r && new_r < grid.length &&
                    0 <= new_c && new_c < grid[0].length ){
                    int oneD = new_r * n + new_c; 
                    if(!seen.contains(oneD)){
                        if(time <= grid[new_r][new_c]){
                            minHeap.add(new inner(new int[]{new_r, new_c}, grid[new_r][new_c]));
                        }else{
                            minHeap.add(new inner(new int[]{new_r, new_c}, time));
                        }
                        seen.add(oneD);
                    }
                }
            }
                      
            
        }
        return -1;
    }
}