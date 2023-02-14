class Solution:
    def minimumDifference(self, nums: List[int]) -> int:
        
        partition_a = []
        partition_b = []

        total = sum(nums)
        target = total // 2
        n = len(nums) // 2

        for i in range(1 << n):
            set_sum_1 = 0
            set_sum_2 = 0
            for j in range(n):
                if (i >> j) & 1:
                    set_sum_1 += nums[j]
                    set_sum_2 += nums[j + n]
            partition_a.append((i.bit_count(), set_sum_1))
            partition_b.append((i.bit_count(), set_sum_2))
        
        partition_a.sort()
        best_sum = float('-inf')
        # print(partition_b, partition_a)
        for count, _sum in partition_b:
            # print(count, _sum)
            left, right = -1, (1 << n) 
            while right > left + 1:
                mid = left + (right - left) // 2
                curr_count, curr_sum = partition_a[mid]
                # print(partition_a[mid])
                if curr_count < n - count or (curr_count == n - count and _sum + curr_sum <= target):
                    # print('haa')
                    left = mid
                else:
                    right = mid
            # print(left, count, n - partition_a[left][0])
            if count == n - partition_a[left][0] and \
             _sum + partition_a[left][1] > best_sum:
                # print(partition_a[left], count, _sum, target)
                best_sum = _sum + partition_a[left][1]
                if best_sum == target:
                    break
        
        return abs(total - best_sum * 2)

        # time -> (2^n)*n





        