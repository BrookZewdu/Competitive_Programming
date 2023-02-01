class Solution:
    def earliestFullBloom(self, plantTime: List[int], growTime: List[int]) -> int:
        n = len(plantTime)
        idx = [i for i in range(n)]
        idx.sort(key = lambda x : -1 * (growTime[x]))
        day = 0
        ans = 0
        print(idx)
        for i in range(n):
            day += plantTime[idx[i]]
            ans = max(ans, day + growTime[idx[i]])
        return ans