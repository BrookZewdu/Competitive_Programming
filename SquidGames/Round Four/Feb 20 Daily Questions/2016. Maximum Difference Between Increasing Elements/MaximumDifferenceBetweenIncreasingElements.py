class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        min_so_far = float('inf')
        ans = -1
        for num in nums:
            if num > min_so_far:
                ans = max(num - min_so_far, ans)
            else:
                min_so_far = num
        return ans