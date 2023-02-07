class Solution:
    def isRobotBounded(self, instructions: str) -> bool:
        direction = ['N', 'E', 'S', 'W']
        curr_direction = 0
        x_pos, y_pos = 0, 0

        for ch in instructions:
            if ch == 'L':
                curr_direction = (curr_direction - 1) % 4
            elif ch == 'R':
                curr_direction = (curr_direction + 1) % 4
            else:
                if curr_direction == 0 or curr_direction == 2:
                    x_pos += [-1, 1][curr_direction == 0]
                else:
                    y_pos += [-1, 1][curr_direction == 1]
            # print(ch, (x_pos, y_pos))

        # print(curr_direction, (x_pos, y_pos))
        return curr_direction != 0 or (x_pos, y_pos) == (0, 0)