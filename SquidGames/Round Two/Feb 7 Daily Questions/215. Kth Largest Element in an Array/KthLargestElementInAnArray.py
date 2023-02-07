class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        def qs(k, low, high):
            piv_idx = partition(low, high)
            if piv_idx == k:
                return nums[piv_idx]
            elif piv_idx > k:
                return qs(k, low, piv_idx - 1)
            else:
                return qs(k, piv_idx + 1, high)
            
        def partition(left, right):
            while left < right:
                # print(left, right)
                if nums[left] >= nums[left + 1]:
                    nums[left], nums[left + 1] = nums[left + 1], nums[left]
                    left += 1
                elif nums[right] >= nums[left]:
                    right -= 1
                else:
                    nums[left + 1], nums[right] = nums[right], nums[left + 1]
            return left
        return qs(len(nums) - k, 0, len(nums) - 1)
        # return partition(0, len(nums) - 1)