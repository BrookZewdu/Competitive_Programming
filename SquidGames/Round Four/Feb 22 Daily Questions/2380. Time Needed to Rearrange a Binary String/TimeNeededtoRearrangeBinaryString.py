class Solution:
    def secondsToRemoveOccurrences(self, s: str) -> int:
        s = list(s)
        ans = 0
        not_found = True
        while not_found:
            ans += 1
            i = 0
            not_found = False
            while i < len(s) - 1:
                if s[i] == '0' and s[i + 1] == '1':
                    s[i] = '1'
                    s[i + 1] = '0'
                    i += 1
                    not_found = True
                i += 1
        return ans - 1
