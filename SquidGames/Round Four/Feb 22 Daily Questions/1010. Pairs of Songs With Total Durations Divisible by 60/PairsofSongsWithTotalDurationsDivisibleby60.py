class Solution:
    def numPairsDivisibleBy60(self, times: List[int]) -> int:
        pre = defaultdict(int)
        ans = 0
        for time in times:
            for i in range(1, 20):
                if 60 * i - time in pre:
                    ans += pre[60 * i - time]
                
            pre[time] += 1
        return ans