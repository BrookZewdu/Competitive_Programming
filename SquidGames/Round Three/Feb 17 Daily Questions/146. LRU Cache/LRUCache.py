class LRUCache:

    def __init__(self, capacity: int):
        self.dict = {}    
        self.head = Node(69)
        self.tail = Node(69, None, self.head)
        self.head.next = self.tail
        self.capacity = capacity

    def get(self, key: int) -> int:
        if key not in self.dict:
            return -1
        node = self.dict[key]
        prev_node = node.prev
        next_node = node.next
        prev_node.next = next_node
        next_node.prev = prev_node

        last = self.tail.prev
        last.next = node
        node.prev = last
        node.next = self.tail
        self.tail.prev = node
        return self.dict[key].val

    def put(self, key: int, value: int) -> None:
        if key in self.dict:
            node = self.dict[key]
            prev_node = node.prev
            next_node = node.next
            prev_node.next = next_node
            next_node.prev = prev_node

            last = self.tail.prev
            last.next = node
            node.prev = last
            node.next = self.tail
            self.tail.prev = node

            node.val = value


        else:
            last = self.tail.prev
            node = Node(value, self.tail, last, key)
            last.next = node
            self.tail.prev = node
            self.dict[key] = node

            if len(self.dict) > self.capacity:
                node_tobe_removed = self.head.next
                self.head.next = node_tobe_removed.next
                node_tobe_removed.next.prev = self.head
                del self.dict[node_tobe_removed.key]

class Node:
    def __init__(self, val = 0, next = None, prev = None, key = 0):
        self.key = key
        self.val = val
        self.next = next
        self.prev = prev


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)