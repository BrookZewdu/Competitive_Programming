class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        adj_list = defaultdict(list)
        for i, (_from, _to) in enumerate(equations):
            adj_list[_from].append((_to, values[i]))
            adj_list[_to].append((_from, 1 / values[i]) if values[i] else (_from, float('inf')))
        
        ans = []
        for _from, _to in queries:
            if _from not in adj_list:
                ans.append(-1)
                continue
                
            queue = deque([(_from, 1)])
            found = False
            seen = set([_from])
            while queue:
                curr, computed_val = queue.popleft()
                if curr == _to:
                    ans.append(computed_val)
                    found = True
                    break
                
                for neigh, weight in adj_list[curr]:
                    if neigh not in seen:
                        queue.append((neigh, computed_val * weight))
                        seen.add(neigh)
            
            if not found:
                ans.append(-1)
        return ans