class Solution:
    def minimumDeletions(self, s: str) -> int:
        # @cache
        # def dp(i, is_b):
        #     if i >= len(s):
        #         return 0
            
        #     if s[i] == 'a':
        #         if is_b:
        #             return 1 + dp(i + 1, is_b)
                
        #         return min(1 + dp(i + 1, is_b), 
        #                     dp(i + 1, is_b))

        #     return min(1 + dp(i + 1, is_b),
        #                 dp(i + 1, 1))
        n = len(s)
        dp = [[float('inf') for _ in range(2)] for _ in range(n + 1)]
        dp[n] = [0, 0]
        for i in range(n - 1, -1, -1):
            for j in range(1, -1, -1):
                if s[i] == 'a':
                    if j:
                        dp[i][j] = 1 + dp[i + 1][1]
                    else:
                        dp[i][j] = min(1 + dp[i + 1][j], dp[i + 1][j])
                else:
                    dp[i][j] = min(1 + dp[i + 1][j], dp[i + 1][1])
        return dp[0][0]

                