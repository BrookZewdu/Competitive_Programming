class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums.sort(reverse = True)
        last = nums[0]
        count = 0
        for num in nums:
            if num != last:
                count += 1
                if count == 2:
                    return num
            last = num 
        return nums[0]