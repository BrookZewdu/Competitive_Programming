class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        n = len(pref)
        ans = 0
        for word in words:
            if len(word) >= n and word[:n] == pref:
                ans += 1
        return ans