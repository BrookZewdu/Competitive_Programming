class Solution {
    public int search(int[] nums, int target) {
        int piv = (nums.length > 1) ? searchPivot(nums) : 0;
        int right = nums.length - 1;
        int left = 0;
        System.out.println(nums[piv]);
        if(target >= nums[left] && target <= nums[piv]){
            return search(nums, left, piv, target);
        }else if(target < nums[left]){
           return search(nums, piv + 1, right, target);
        }else{
            return search(nums, left, right, target);
        }
    }
    private int search(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
     private int searchPivot(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int last = right;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]){
                return mid;
            }else if(nums[mid] > nums[last]){
                left = mid + 1;
            }else if(nums[mid] < nums[last]){
                right = mid - 1;
            }
        }
        return 0;
    }
}