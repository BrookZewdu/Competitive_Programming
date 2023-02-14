class Solution:
    def reorderedPowerOf2(self, n: int) -> bool:

        i = 1
        while i < 10 ** 9:
            if sorted(str(i), reverse = True) == sorted(str(n), reverse = True):
                return True
            i *= 2
        
        return False