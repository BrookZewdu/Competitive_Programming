class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> dict = new HashMap<>();
        int op_counter = 0;
        int count;
        for(int i = 0; i < nums.length; i++){
            count = 1;
            dict.put(nums[i], dict.containsKey(nums[i])? dict.get(nums[i])+1: count);
        }
        for(int i = 0; i < nums.length; i++){
            int complement = k - nums[i];
            dict.put(nums[i], dict.get(nums[i]) - 1);
            if(dict.containsKey(complement) && dict.get(complement) > 0){
                op_counter++;
                dict.put(complement, dict.get(complement) - 1);
                
            }
           
        }
        return op_counter;
    }
}