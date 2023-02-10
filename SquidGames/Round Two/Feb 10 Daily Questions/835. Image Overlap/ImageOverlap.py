class Solution:
    def largestOverlap(self, img1: List[List[int]], img2: List[List[int]]) -> int:
        count = defaultdict(int)
        inbound = lambda x, y : 0 <= x < n and 0 <= y < n
        ans = 0
        n, m = len(img1), len(img2)

        for i in range(n):
            for j in range(n):
                if img1[i][j] == 1:
                    for dx in range(n):
                        for dy in range(n):
                            if dx == 0 and dy == 0:
                                continue

                            id_x, id_y = i + dx, j + dy
                            if inbound(id_x, id_y):
                                count[(dx, dy)] += img2[id_x][id_y]
                                ans = max(ans, count[(dx, dy)])

                            if dx and dy:
                                id_x, id_y = i - dx, j - dy
                                if inbound(id_x, id_y):
                                    count[(-1 * dx, -1 * dy)] += img2[id_x][id_y]
                                    ans = max(ans, count[(-1 * dx, -1 * dy)])

                            if dx:
                                id_x, id_y = i - dx, j + dy
                                if inbound(id_x, id_y):
                                    count[(-1 * dx, dy)] += img2[id_x][id_y]
                                    ans = max(ans, count[(-1 * dx, dy)])

                            if dy:
                                id_x, id_y = i + dx, j - dy
                                if inbound(id_x, id_y):
                                    count[(dx, -1 * dy)] += img2[id_x][id_y]
                                    ans = max(ans, count[(dx, -1 * dy)])

                    count[(0, 0)] += img2[i][j]
                    ans = max(ans, count[(0, 0)])

 
        return ans