class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       int temp;
        List<Integer> sorted = new ArrayList<Integer>();
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 0; j < nums.length -1 -i; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                sorted.add(i);
            }
        }
        return sorted;
    }
}
