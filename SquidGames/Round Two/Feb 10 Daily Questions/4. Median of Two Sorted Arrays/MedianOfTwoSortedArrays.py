class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n, m = len(nums1), len(nums2)
        if n > m:
            nums1, nums2 = nums2, nums1
            n, m = m, n
        # print(len(nums1), n, m, len(nums2))
        half = (n + m) // 2
        left, right = 0, n - 1
        while True:
            mid = left + (right - left) // 2
            first_left = nums1[mid] if mid >= 0 else float('-inf')
            first_right = nums1[mid + 1] if mid < n - 1 else float('inf')

            idx = half - mid - 2
            second_left = nums2[idx] if idx >= 0 else float('-inf')
            second_right = nums2[idx + 1] if idx < m - 1 else float('inf')

            if first_left <= second_right and second_left <= first_right:
                if (n + m) % 2:
                    return min(second_right, first_right)
                else:
                    return (max(first_left, second_left) + min(first_right, second_right)) / 2
            elif first_left > second_right:
                right = mid - 1
            else:
                left = mid + 1
        return -1 