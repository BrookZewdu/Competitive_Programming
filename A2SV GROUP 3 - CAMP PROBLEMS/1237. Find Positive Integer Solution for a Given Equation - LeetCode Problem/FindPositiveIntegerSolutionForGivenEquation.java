/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> lst = new ArrayList<>();
        // System.out.println(customfunction.f(1,5));
        for(int i = 1; i < 1000; i++){
            int left = 1;
            int right = 1000;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(customfunction.f(i, mid) < z){
                    left = mid + 1;
                }else if(customfunction.f(i, mid) > z){
                    right = mid - 1;
                }else{
                    lst.add(new ArrayList<>(Arrays.asList(i,mid)));
                    break;
                }
            }
        }
        
        return lst;
    }
}


/*
    for(int i = 1; i <= 1000; i++){
            for(int j = 1; j <= 1000; j++){
                if(customfunction.f(i,j) == z){
                    lst.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
*/