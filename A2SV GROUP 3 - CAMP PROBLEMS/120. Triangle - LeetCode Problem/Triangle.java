class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int row = triangle.size();
        for(int i = row - 2; i >= 0; i--) {
            for(int j = 0; j < triangle.get(i).size(); j++ ){
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min( triangle.get(i + 1).get(j),
                                                triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}