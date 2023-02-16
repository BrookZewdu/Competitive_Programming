class Solution:
    def findOriginalArray(self, changed: List[int]) -> List[int]:
        if len(changed) % 2:
            return []
        changed.sort()
        count = Counter(changed)
        ans = []
        for i in changed:
            if count[i] <= 0:
                continue
            count[i] -= 1
            if i * 2 in count and count[i * 2] > 0:
                count[i * 2] -= 1
                ans.append(i)
        return ans if (len(ans) == len(changed) // 2) else []                
                
        