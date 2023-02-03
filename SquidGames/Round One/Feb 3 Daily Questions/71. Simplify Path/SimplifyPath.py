class Solution:
    def simplifyPath(self, path: str) -> str:
        stack = []
        # remove duplicate slashes
        for ch in path:
            if not (ch == '/' and stack and stack[-1] == '/'):
                stack.append(ch)
        path = ''.join(stack)
        
        # logic
        stack = []
        i = 0
        while i < len(path):
            j = i + 1
            curr = '/'
            while j < len(path) and path[j] != '/':
                curr += path[j]
                j += 1   
            i = j
            if curr == '/..':
                if stack: stack.pop()
            elif curr == '/.':
                continue
            else:
                stack.append(curr)

        # post processing
        ans = ''.join(stack)
        if len(ans) > 1 and ans[-1] == '/':
            return ans[:-1]
        elif len(ans) == 0:
            return '/'
        else:
            return ans