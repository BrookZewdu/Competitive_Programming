class Solution:
    def subarraysWithKDistinct(self, nums: List[int], k: int) -> int:
        # subarrays with >= k distinct elements
        count = defaultdict(int)
        n = len(nums)
        left = 0
        count_greater_k = 0
        for right in range(n):
            count[nums[right]] += 1

            while len(count) > k or (len(count) == k and count[nums[left]] > 1):
                count[nums[left]] -= 1
                if not count[nums[left]]:
                    del count[nums[left]]
                left += 1

            if len(count) == k:
                count_greater_k += left + 1

        # print(count_greater_k)
        left = count_greater = 0
        count = defaultdict(int)
        for right in range(n):
            count[nums[right]] += 1

            while len(count) > (k + 1) or (len(count) == (k + 1) and count[nums[left]] > 1):
                count[nums[left]] -= 1
                if not count[nums[left]]:
                    del count[nums[left]]
                left += 1

            if len(count) == (k + 1):
                count_greater += left + 1

        return count_greater_k - count_greater
        
