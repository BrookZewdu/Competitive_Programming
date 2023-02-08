class Solution:
    def restoreArray(self, adjacentPairs: List[List[int]]) -> List[int]:
        connections = defaultdict(set)
        for curr, neigh in adjacentPairs:
            connections[curr].add(neigh)
            connections[neigh].add(curr)

        hold = [key for key, value in connections.items() if len(value) == 1][0]
        nums = []
        seen = set()
        while len(nums) < len(connections):
            seen.add(hold)
            nums.append(hold)
            temp = -1
            for neigh in connections[hold]:
                if neigh not in seen:
                    temp = neigh
            hold = temp
        return nums