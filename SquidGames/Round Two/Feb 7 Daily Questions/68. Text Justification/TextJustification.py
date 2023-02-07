class Solution:
    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        i = 0
        ans = []
        while i < len(words):
            s = ''
            j = i
            count = 0
            while j < len(words) and count + len(words[j]) <= maxWidth:
                count += len(words[j]) + 1
                j += 1
            count -= 1
            extra = maxWidth - count
            word_count = j - i - 1
            remaindar = extra_spaces = 0
            if word_count:
                remaindar = extra % word_count
                extra_spaces = extra // word_count

            for k in range(i, j - 1):
                s += words[k] + ' '
                s += ' ' * extra_spaces
                if remaindar:
                    s += ' '
                    remaindar -= 1
            s += words[j - 1]
            offset = maxWidth - len(s)
            s += ' ' * offset
            ans.append(s)
            i = j
        hold = ans.pop()
        hold = hold.split(' ')
        s = ''
        for word in hold:
            if word != '':
                s += word + ' '
        # print(s + 'g')
        s = s.rstrip()
        # print(s + 'f')

        offset = maxWidth - len(s)
        if offset < 1:
            s.strip()
        else:
            s += ' ' * offset
        ans.append(s)
        return ans
            # 16 - 10 = 6