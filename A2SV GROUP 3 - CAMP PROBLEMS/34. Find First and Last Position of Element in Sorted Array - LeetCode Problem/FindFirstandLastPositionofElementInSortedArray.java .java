class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int targetIndex = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                targetIndex = mid;
                break;
            }
        }
        if(targetIndex == -1) return new int[]{-1,-1};
        return answerSetter(findFirst(nums, left, targetIndex, target) + 1, findLast(nums, targetIndex, right, target) - 1);

    }
    private int[] answerSetter(int start, int end){
        int[] ans = new int[2];
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    private int findFirst(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] == target){
                end = mid - 1;
            }
        }
        return end;
    }
    private int findLast(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] == target){
                start = mid + 1;
            }else{
//                break;
            }
        }
        return start;
    }
}

/*
    int left = 0;
        int right = nums.length - 1;
        int targetIndex = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                targetIndex = mid;
                break;
            }
        }
        if(targetIndex == -1) return new int[]{-1,-1};
        int start = left;
        int end = targetIndex;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] == target){
                end = mid - 1;
            }

        }
        int[] ans = new int[2];
        ans[0] = end + 1;
        start = targetIndex;
        end = right;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] == target){
                start = mid + 1;
            }
        }
        ans[1] = start - 1;
        return ans;
*/