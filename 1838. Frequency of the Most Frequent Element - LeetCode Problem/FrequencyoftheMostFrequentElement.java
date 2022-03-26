class Solution {
    public int maxFrequency(int[] nums, int k) {
        if (nums.length < 2) return 1;
        Arrays.sort(nums);
        int max = 1;
        int increment = 0;
        int left = 0;
        for (var right = 1; right < nums.length; right++) {
            int diff = nums[right] - nums[right - 1];
            increment += (right - left) * diff;
        
            while (left < right && increment > k) {
                increment -= nums[right] - nums[left];
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}