class Solution:
    def countSubarrays(self, nums: List[int], minK: int, maxK: int) -> int:
        n = len(nums)
        minSuf = [0 for _ in range(n)]
        maxSuf = [0 for _ in range(n)]
        nSuf = [0 for _ in range(n)]
        last = n
        nLast = n
        minLast = n
        for i in range(n - 1, -1, -1):
            if nums[i] >= maxK:
                last = i
            if nums[i] > maxK or nums[i] < minK:
                nLast = i
            if nums[i] <= minK:
                minLast = i
            minSuf[i] = (minLast)
            maxSuf[i] = (last)
            nSuf[i] = (nLast)
        # [1,3,5,2,7,5]
        ans = 0
        for i in range(n):
            # print(i, nSuf[i], minSuf[i], maxSuf[i])
            ans += nSuf[i] - min(nSuf[i], max(minSuf[i], maxSuf[i]))
        return ans