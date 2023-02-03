class Solution:
    def validPalindrome(self, s: str) -> bool:
        def isvalid(i, j, deleted):
            if i >= j:
                return True
            
            if s[i] == s[j]:
                return isvalid(i + 1, j - 1, deleted)
            else:
                if deleted:
                    return False
                return isvalid(i + 1, j , True) or isvalid(i, j - 1, True)
        return isvalid(0, len(s) - 1, False)