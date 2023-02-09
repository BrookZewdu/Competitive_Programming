class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        ans = []
        def backtrack(i, count, curr, str_so_far):
            if i >= len(s):
                if count == 3:
                    ans.append(str_so_far)
                return
            
            if len(curr) == 3:
                backtrack(i + 1, count + 1, s[i], str_so_far + '.' + s[i])

            elif len(curr) == 2:
                if curr[0] < '3':
                    if curr + s[i] <= '255':
                        backtrack(i + 1, count, curr + s[i], str_so_far + s[i])
                backtrack(i + 1, count + 1, s[i], str_so_far + '.' + s[i])

            elif len(curr) == 1:
                if curr[0] != '0':
                    backtrack(i + 1, count, curr + s[i], str_so_far + s[i])
                backtrack(i + 1, count + 1, s[i], str_so_far + '.' + s[i])

            else:
                backtrack(i + 1, count, curr + s[i], str_so_far + s[i])

        backtrack(0, 0, '', '')
        return ans
                

                