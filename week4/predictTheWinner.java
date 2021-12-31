class Solution {
    private int[] nums;
    public int sum(int start,int end){
        if(start == end){
            return nums[start];
        }else{
            return Math.max(nums[start] - sum(start+1, end), nums[end] - sum(start,end-1));
        }
       
    }  
    
    public boolean PredictTheWinner(int[] nums) {
        this.nums = nums;
        if(sum(0, nums.length - 1) >= 0){
            return true;
        }else{
            return false;
        }
        
    }
}