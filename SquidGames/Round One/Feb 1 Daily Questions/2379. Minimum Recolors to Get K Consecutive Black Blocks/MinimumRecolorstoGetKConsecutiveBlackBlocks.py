class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        min_operation = float('inf')
        white_count = 0

        for i in range(k):
            white_count += blocks[i] == 'W'
        
        left = 0
        n = len(blocks)
        min_operation = white_count

        for right in range(k, n):
            white_count += blocks[right] == 'W'
            white_count -= blocks[left] == 'W'
            min_operation = min(min_operation, white_count)
            left += 1
            
        return min_operation