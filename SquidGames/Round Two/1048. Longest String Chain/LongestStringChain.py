class Solution:
    def longestStrChain(self, words: List[str]) -> int:
        words.sort(key = lambda x : len(x))
        table = defaultdict(int)

        for word in words:
            max_so_far = 0
            for i in range(len(word)):
                hold = (word[:i] + word[i + 1:])
                if hold in table:
                    max_so_far = max(max_so_far, table[hold] + 1)
            table[word] = mafx_so_far
        
        ans = 0
        for word in table:
            ans = max(ans, table[word])
        return ans + 1