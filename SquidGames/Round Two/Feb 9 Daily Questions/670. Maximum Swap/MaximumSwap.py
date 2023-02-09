class Solution:
    def maximumSwap(self, num: int) -> int:
        digits = [int(x) for x in str(num)]

        for i in range(len(digits)):
            max_index = i
            for j in range(i, len(digits)):
                if digits[j] >= digits[max_index]:
                    max_index = j
            if max_index != i and digits[max_index] != digits[i]:
                digits[i], digits[max_index] = digits[max_index], digits[i]
                break
                
        return int(''.join([str(digit) for digit in digits]))