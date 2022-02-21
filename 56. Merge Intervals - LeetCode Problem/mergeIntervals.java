class Solution {
    public int[][] merge(int[][] intervals) {
       if(intervals.length <= 1){
           return intervals;
       }
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
        List<int[] > lst = new ArrayList<>();
        int[] ans = intervals[0];
        lst.add(ans);
        for(int[] itr : intervals){
            if(itr[0] <= ans[1]){
                ans[1] = Math.max(itr[1], ans[1]);
            }else{
                ans = itr;
                lst.add(ans);
            }
        }
        return lst.toArray(new int[lst.size()][2]);
    }
}