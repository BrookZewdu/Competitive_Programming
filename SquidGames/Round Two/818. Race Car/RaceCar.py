class Solution:
    def racecar(self, target: int) -> int:
        queue = deque([(0, 1)])
        seen = set((0, 1))
        count = 0

        while queue:
            size = len(queue)
            for _ in range(size):
                pos, speed = queue.popleft()
                # print(pos, speed)
                if pos == target:
                    return count

                if (pos, [-1, 1][speed <= -1]) not in seen:
                    queue.append((pos, [-1, 1][speed <= -1]))
                    seen.add((pos, [-1, 1][speed <= -1]))
                
                if (pos + speed, speed * 2) not in seen:
                    queue.append((pos + speed, speed * 2))
                    seen.add((pos + speed, speed * 2))

            count += 1
        return -1
