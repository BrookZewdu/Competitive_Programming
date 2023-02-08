class Solution:
    def numBusesToDestination(self, routes: List[List[int]], source: int, target: int) -> int:
        available_buses = defaultdict(list)
        
        for i, route in enumerate(routes):
            for stop in route:
                available_buses[stop].append(i)
        
        queue = deque([(source, 0, -1)])
        seen = set([source])
        seen_route = set()

        while queue:
            curr_stop, steps, curr_route = queue.popleft()
            seen_route.add(curr_route)
            if curr_stop == target:
                return steps
            for availables in available_buses[curr_stop]:
                if availables not in seen_route:
                    for stops in routes[availables]:
                        if stops not in seen and availables != curr_route:
                            queue.append((stops, steps + 1, availables))
                            seen.add(stops)
                    seen_route.add(availables)
        return -1