class Solution:
    def numberOfWays(self, s: str) -> int:
        # @lru_cache(None)
        # def dp(i, selected, last):
        #     if selected >= 3:
        #         return 1
        #     if i >= len(s):
        #         return 0
            
        #     if s[i] == last:
        #         return dp(i + 1, selected, last)
        #     else:
        #         return dp(i + 1, selected, last) + dp(i + 1, selected + 1,  s[i])
        # return dp(0, 0, '-1')
        zero_count = []
        one_count = []
        zeros = ones = 0
        for num in s:
            zeros += num == '0'
            ones += num == '1'
            one_count.append(ones)
            zero_count.append(zeros)
        
        # "0  0  1  1  0  1
        # [0, 2, 4, 6, 9, 12]
        # 01 subsequence
        zero_one = [0]
        for i in range(1, len(s)):
            num = s[i]
            if num == "0":
                zero_one.append(zero_one[i - 1])
            else:
                zero_one.append(zero_one[i - 1] + zero_count[i])
        # print(zero_one)
        # 10 subsequence
        one_zero = [0]
        for i in range(1, len(s)):
            num = s[i]
            if num == '0':
                one_zero.append(one_zero[i - 1] + one_count[i])
            else:
                one_zero.append(one_zero[i - 1])
        ans = 0
        for i, num in enumerate(s):
            if num == '1':
                ans += one_zero[i]
            else:
                ans += zero_one[i]
        return ans
        # 010
        # 101