class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));
        
        int start = points[0][0], end = points[0][1];
        int count = 1;
        
        for(int i = 1; i < points.length; i++){
           if (points[i][0] >= start && points[i][0] <= end) {
               start = points[i][0];
               end = Math.min(end, points[i][1]);
               continue;
           }
            count++;
            start = points[i][0];
            end = points[i][1];
        }
        return count;
        
    }
}
//[[1,10],[2,4],[3,6],[5,9]]
/*
    [[10,16],[2,8],[1,6],[7,12]]
    [[1,2],[3,4],[5,6],[7,8]]
    [[1,2],[2,3],[3,4],[4,5]]
    [[1,10],[2,4],[3,6],[5,9]]
    [[1,9],[1,10],[1,13]]
    [[-2147483648,2147483647],[1,2],[3,4],[5,2147483647]]
    [[-80,10],[1,2],[3,4],[5,2147483647]]
*/