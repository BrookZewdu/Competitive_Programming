class Solution:
    def checkValidString(self, s: str) -> bool:
        @cache
        def dp(i, count):
            if count < 0:
                return False
            if i >= len(s):
                return count == 0
            
            count += s[i] == '('
            count -= s[i] == ')'

            if s[i] == '*':
                return dp(i + 1, count + 1) or dp(i + 1, count - 1) or dp(i + 1, count)
            return dp(i + 1, count)
        return dp(0, 0)