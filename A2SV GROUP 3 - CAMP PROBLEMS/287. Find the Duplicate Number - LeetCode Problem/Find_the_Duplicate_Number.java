class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 2) return nums[0];
        //3,1,3,4,2
        int left = 1;
        int right = nums.length - 1;
        int mid = 0;
        //[1,3,4,2,2]
        //1,2,3,4
        //l m 
        //r  
        while(left <= right){
            mid = left + (right - left) / 2;
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
            if(count > mid) {
                right = mid - 1;
            }else if(count <= mid){
                left = mid + 1;
            }
        }
        
        return left ;
    }
}
//cant modify the array
// cant use extra linear spave
//only one number is duplictae others are distinct
//return the repeated number