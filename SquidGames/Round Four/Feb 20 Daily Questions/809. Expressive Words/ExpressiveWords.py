class Solution:
    def expressiveWords(self, s: str, words: List[str]) -> int:
        arr = []
        i = 0
        while i < len(s):
            ch = s[i]
            j = i
            while j < len(s) and s[j] == ch:
                j += 1
            arr.append((ch, j - i)) 
            i = j
        ans = 0
        for word in words:
            i = 0
            hold = []
            while i < len(word):
                ch = word[i]
                j = i
                while j < len(word) and word[j] == ch:
                    j += 1
                hold.append((ch, j - i)) 
                i = j
            
            first, second = 0, 0
            if len(hold) != len(arr):
                continue
            # print(hold, arr)
            count = True
            for i in range(len(hold)):
                if not (hold[i][0] == arr[i][0] and \
                    (hold[i][1] == arr[i][1] or (hold[i][1] < 3 and arr[i][1] >= 3))):
                    count = False
                    break
            ans += count
        return ans
            