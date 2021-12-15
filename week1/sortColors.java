class Solution {
    public void sortColors(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 0; j < nums.length -1 -i; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.printf("[");
        for(int i = 0; i < nums.length-1; i++){
             System.out.printf("%d," ,nums[i]);
             
        }
        System.out.printf("%d]", nums[nums.length-1]);
       
    }
}
