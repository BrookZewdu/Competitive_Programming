class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []
        def backtrack(i, curr):
            if i >= n * 2:
                stack = []
                for ch in curr:
                    if ch == ')' and stack and stack[-1] == '(':
                        stack.pop()
                    else:
                        stack.append(ch)
                if not stack:
                    ans.append(''.join(curr))
                return

            curr.append('(')
            backtrack(i + 1, curr)
            curr.pop()
            curr.append(')')
            backtrack(i + 1, curr)
            curr.pop()
        backtrack(0, [])
        return ans


            

            
