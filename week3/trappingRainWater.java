class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int p1 = 0;
        int p2 = height.length - 1;
        int res = 0;
        
        while(p1 < p2){
            if(height[p1] < height[p2]){
                if(leftMax < height[p1]){
                    leftMax = height[p1];
                }else{
                    res += leftMax - height[p1];
                }                
                p1++;
            }else{
                if(rightMax < height[p2]){
                    rightMax = height[p2];
                }else{
                    res += rightMax - height[p2];
                }
                p2--;
            }
            
        }
        return res;
    }
}