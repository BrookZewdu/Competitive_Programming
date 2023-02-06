class DetectSquares:

    def __init__(self):
        self.dict = defaultdict(int)

    def add(self, point: List[int]) -> None:
        x, y = point
        self.dict[(x, y)] += 1
        # pass

    def count(self, point: List[int]) -> int:
        curr_x, curr_y = point
        ans = 0
        for x, y in self.dict:
            if y == curr_y:
                dist = abs(curr_x - x)
                if not dist:
                    continue
                if (x, y + dist) in self.dict and (curr_x, curr_y + dist) in self.dict:
                    ans += self.dict[(x, y)] * self.dict[(x, y + dist)] * self.dict[(curr_x, curr_y + dist)]
                if (x, y - dist) in self.dict and (curr_x, curr_y - dist) in self.dict:
                    ans += self.dict[(x, y)] * self.dict[(x, y - dist)] * self.dict[(curr_x, curr_y - dist)]
            

        return ans


# Your DetectSquares object will be instantiated and called as such:
# obj = DetectSquares()
# obj.add(point)
# param_2 = obj.count(point)