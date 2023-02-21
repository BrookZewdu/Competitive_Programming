class Solution:
    def shortestPathAllKeys(self, grid: List[str]) -> int:
        dirs = [(0, 1), (1, 0), (-1, 0), (0, -1)]
        seen = set()
        num_keys = 0
        n, m = len(grid), len(grid[0])
        start_x, start_y = -1, -1
        for i in range(n):
            for j in range(m):
                if grid[i][j] == '@':
                    start_x, start_y = i, j
                if ord('a') <= ord(grid[i][j]) <= ord('z'):
                    num_keys += 1 
        # print('f', start_x, start_y)
        ans = 0
        ans_set = set()
        queue = deque([(start_x, start_y, 0, 0,'&')])
        inbound = lambda x, y : 0 <= x < n and 0 <= y < m
        while queue:
            curr_x, curr_y, steps, keys, g = queue.popleft()
        

            if ord('a') <= ord(grid[curr_x][curr_y]) <= ord('z'):
                keys |= 1 << (ord(grid[curr_x][curr_y]) - ord('a'))

            if keys.bit_count() == num_keys:
                return steps

            if (ord('A')) <= ord(grid[curr_x][curr_y]) <= ord('Z'):
                # print(grid[new_x][new_y].lower())
                if (keys >> (ord(grid[curr_x][curr_y].lower())) - ord('a')) & 1 == 0:
                    continue
            for dx, dy in dirs:
                new_x, new_y = curr_x + dx, curr_y + dy
                if inbound(new_x, new_y) and grid[new_x][new_y] != '#':
                    # print(curr_x, curr_y, keys, new_x, new_y)
                    if (new_x, new_y, keys) not in seen:
                        seen.add((new_x, new_y, keys))
                        queue.append((new_x, new_y, steps + 1, keys, g + grid[new_x][new_y]))
        return -1
            
        '''
        ["@.a..",
        "###.#",
        "b.A.B"]
        '''

