class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ans = [0 for _ in range(len(nums))]
        left, right = 0, len(nums) - 1
        writer = len(nums) - 1

        while left <= right:
            if nums[left] * nums[left] >= nums[right] * nums[right]:
                ans[writer] = nums[left] * nums[left]
                left += 1
            else:
                ans[writer] = nums[right] * nums[right]
                right -= 1
            writer -= 1
            
        return ans