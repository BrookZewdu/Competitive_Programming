class Solution {
    public String largestNumber(int[] nums) {
        int temp;
        StringBuilder s = new StringBuilder();
            for(int i = 0; i < nums.length - 1;i++){
                for(int j = 0; j < nums.length-1-i; j++){
                    if(Long.parseLong(Integer.toString(nums[j]) + Integer.toString(nums[j+1])) > Long.parseLong((Integer.toString(nums[j+1]) + Integer.toString(nums[j])))){
                        temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;  
                    }
                }
            }
        int count = 0;
        for(int x:nums){
            if(x==0){
                count++;
            }
            
        }
            for(int x = nums.length-1; x >= 0; x--){
                if(count != nums.length){
                    s.append(nums[x]);
                }else{
                    s.append(nums[0]);
                    break;
                }
                
            }
           
        
         return s.toString();
    }
}
