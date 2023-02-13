class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        total = 0
        _dict = defaultdict(int)
        _dict[0] = 1
        ans = 0
        for num in nums:
            total += num
            ans += _dict.get(total % k, 0)
            _dict[total % k] += 1
        return ans
            