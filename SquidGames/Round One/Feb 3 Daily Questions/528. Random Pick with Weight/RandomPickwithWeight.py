class Solution:

    def __init__(self, w: List[int]):
        self.prefix = []
        total = 0
        for weight in w:
            total += weight
            self.prefix.append(total)        

    def pickIndex(self) -> int:
        random_number = randint(1, self.prefix[-1])
        left, right = -1, len(self.prefix) 
        while right > left + 1:
            mid = left + (right - left) // 2
            if self.prefix[mid] >= random_number:
                right = mid
            else:
                left = mid
        return right


# Your Solution object will be instantiated and called as such:
# obj = Solution(w)
# param_1 = obj.pickIndex()