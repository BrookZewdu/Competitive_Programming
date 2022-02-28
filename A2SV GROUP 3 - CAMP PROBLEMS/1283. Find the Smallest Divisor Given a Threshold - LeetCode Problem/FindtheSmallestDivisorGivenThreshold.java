class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // if(nums.length == 1) return 1;
        // if(summer(nums, 1) < threshold) return 1;
        Arrays.sort(nums);
        int left = 1;
        // System.out.println(1e6);
        int right = nums[nums.length - 1];
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int sum = summer(nums, mid);
            if(sum > threshold){
                left = mid + 1;
            }else if(sum <= threshold){
                right = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
    private int summer(int[] nums, int divisor){
        int sum = 0;
        for(int i : nums){
            sum += (int)Math.ceil(i / (double)divisor);
        }
        return sum;
    }
}
