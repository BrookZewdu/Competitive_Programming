class Solution:
    def numOfPairs(self, nums: List[str], target: str) -> int:
        count = defaultdict(int)
        ans = 0 

        for num in nums:
            n = len(num)
            if n < len(target) and num == target[:n]:
                ans += count[target[n:]]
            if n < len(target) and num == target[-n:]:
                ans += count[target[:-n]]
            count[num] += 1
            
        return ans