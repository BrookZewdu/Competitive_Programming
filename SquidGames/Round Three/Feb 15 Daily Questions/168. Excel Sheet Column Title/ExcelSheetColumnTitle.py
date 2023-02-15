class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        ans = ''
        while columnNumber:
            
            ans = chr((columnNumber - 1) % 26 + ord('A')) + ans
            columnNumber = (columnNumber - 1) // 26
        
        return ans