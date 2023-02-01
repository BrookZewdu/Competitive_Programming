class Solution:
    def matrixBlockSum(self, mat: List[List[int]], k: int) -> List[List[int]]:
        n, m = len(mat), len(mat[0])
        prefix_sum = [ [0 for _ in range(m + 1) ] for _ in range(n + 1) ]

        for i in range(n):
            for j in range(m):
                prefix_sum[i + 1][j + 1] = (mat[i][j] + prefix_sum[i][j + 1] + 
                                            prefix_sum[i + 1][j] - prefix_sum[i][j])
        for i in range(n):
            for j in range(m):
                from_x, from_y = i - k if i >= k else 0, j - k if j >= k else 0
                to_x, to_y = i + k if i + k < n else n - 1, j + k if j + k < m else m - 1
                mat[i][j] = (prefix_sum[to_x + 1][to_y + 1] - prefix_sum[to_x + 1][from_y] -
                            prefix_sum[from_x][to_y + 1] + prefix_sum[from_x][from_y])
        return mat