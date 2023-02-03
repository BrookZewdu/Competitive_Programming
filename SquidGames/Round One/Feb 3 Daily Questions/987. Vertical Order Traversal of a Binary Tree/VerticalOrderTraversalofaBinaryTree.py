# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        table = defaultdict(list)
        def dfs(node, row, col):
            if not node:
                return
            
            table[(row, col)].append(node.val)
            dfs(node.left, row + 1, col - 1)
            dfs(node.right, row + 1, col + 1)
        
        dfs(root, 0, 0)
        min_col = 0
        max_row = 0
        max_col = 0
        for row, col in table:
            min_col = min(min_col, col)
            max_col = max(max_col, col)
            max_row = max(max_row, row)
            table[(row, col)].sort()
            
        ans = []
        for j in range(min_col, max_col + 1):
            tmp = []
            for i in range(max_row + 1):
                for num in table[(i, j)]:
                    tmp.append(num)
            ans.append(tmp)
        return ans


