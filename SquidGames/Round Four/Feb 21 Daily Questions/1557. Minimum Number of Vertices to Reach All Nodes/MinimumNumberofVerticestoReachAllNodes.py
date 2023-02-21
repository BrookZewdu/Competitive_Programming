class Solution:
    def findSmallestSetOfVertices(self, n: int, edges: List[List[int]]) -> List[int]:
        indegree = [0 for _ in range(n)]
        for _from, _to in edges:
            indegree[_to] += 1
        
        return [i for i, x in enumerate(indegree) if not x]