class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        pre = float('-inf')
        ans = pre
        for num in nums:
            pre = max(pre + num, num)
            ans = max(ans, pre)
        return ans
        