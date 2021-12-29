class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int max_area = (p2 - p1)*Math.min(height[p1],height[p2]);
        int shrinking_window_area = max_area;
        while(p2 - p1 > 1){
                if(height[p1] <= height[p2]){
                    p1++;
                }else{
                    p2--;
                }
            shrinking_window_area = (p2 - p1)*Math.min(height[p1],height[p2]);
            if(shrinking_window_area > max_area){
                max_area = shrinking_window_area;
            }
            
        }
        
        return max_area;
    }
}