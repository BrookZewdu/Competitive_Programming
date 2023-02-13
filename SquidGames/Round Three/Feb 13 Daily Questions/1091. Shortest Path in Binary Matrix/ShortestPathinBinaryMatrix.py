from collections import deque
class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        if grid[0][0] == 1: return -1
        
        dirs = [(0, 1), (1, 0), (0, -1), (-1, 0), (1, 1), (1, -1), (-1, 1), (-1, -1)]
        end_point = (len(grid) - 1, len(grid[0]) - 1)
        queue = deque([(0, 0)]) # state -> (row, col)
        grid[0][0] = 1 
        steps = 1
        
        while queue:
            for _ in range(len(queue)):
                row, col = queue.popleft()
                if (row, col) == end_point:
                    return steps
                
                for r_add, c_add in dirs:
                    new_row = row + r_add
                    new_col = col + c_add
                    if 0 <= new_row < len(grid) and \
                        0 <= new_col < len(grid[0]) and \
                         grid[new_row][new_col] == 0:
                        queue.append((new_row, new_col))
                        grid[new_row][new_col] = 1
            
            steps += 1
        
        return -1