class Solution:
    def bestTeamScore(self, scores: List[int], ages: List[int]) -> int:
        n = len(scores)
        pairs = [(ages[i], scores[i]) for i in range(len(scores))]
        pairs.sort()
        pairs = [(0, 0)] + pairs
        
        dp = [[0 for _ in range(n + 2)] for _ in range(n + 2)]
        for i in range(n, -1, -1):
            for j in range(n, -1, -1):
                if pairs[i][1] < pairs[j][1]:
                    dp[i][j] = dp[i + 1][j]
                else:
                    hold = j
                    if pairs[i][1] > pairs[j][1]:
                        hold = i
                    dp[i][j] = max(dp[i + 1][j], pairs[i][1] + dp[i + 1][hold])
        return dp[0][0]
