class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        _set = set(nums)
        ans = 0
        for num in _set:
            ans += num > 0
        return ans