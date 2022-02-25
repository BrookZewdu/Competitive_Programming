class Solution {
    public int countNegatives(int[][] grid) {
       int neg = 0;
        for(int i = 0; i < grid[0].length; i++){
            int left = 0;
            int right = grid.length - 1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(grid[mid][i] >= 0){
                    left = mid + 1;
                }else if(grid[mid][i] < 0){
                    right = mid - 1;
                }
            }
            neg += left;
        }
        return grid.length * grid[0].length - neg;
    }
}


/*
    THIS TECHNICALLY WORKS AND PASSES BUT JAVA IS DOING THE WORK SO TECHNICALLY IT IS CHEATING, LETS TR TO DO IT BETTER THAN JAVA! well, if java was given the problem, it will prolly do way better though
    class Solution {
    public int countNegatives(int[][] grid) {
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                lst.add(grid[i][j]);
            }
        }
        List<Integer> ans = lst.stream()
            .filter( c -> c.intValue() < 0)
            .toList();
        return ans.size();
    }
}
*/