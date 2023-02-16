class Solution:
    def romanToInt(self, s: str) -> int:
        _dict = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000
        }
        
        subtract = {
            'I' : set(['V', 'X']),
            'X' : set(['L' , 'C']),
            'C' : set(['D', 'M'])
        }
        ans = 0
        i = 0
        while i < (len(s)):
            ch = s[i]
            if ch in subtract and i < len(s) - 1 and \
                s[i + 1] in subtract[ch]:
                ans += (_dict[s[i + 1]] - _dict[ch])
                i += 1
            else:
                ans += _dict[ch]
            i += 1
        return ans
