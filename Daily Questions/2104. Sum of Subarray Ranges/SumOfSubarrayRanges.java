class Solution {
    public long subArrayRanges(int[] nums) {
        long res = 0;
        Stack<Integer> stack = new Stack<>();
        

        int max = nums[0], min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = min = nums[i];
            for (int j = i; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                // System.out.println(nums[i] + " " + min);
                res += (max - min);
            }
        }
        return res;
    }
}

