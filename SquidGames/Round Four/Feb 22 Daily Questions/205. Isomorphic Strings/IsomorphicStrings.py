class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        mapped = defaultdict(str)
        taken = set()
        for i in range(len(s)):
            if s[i] not in mapped and t[i] not in taken:
                mapped[s[i]] = t[i]
                taken.add(t[i])
            elif s[i] in mapped and mapped[s[i]] != t[i]:
                return False
            elif s[i] not in mapped and t[i] in taken:
                return False
        return True