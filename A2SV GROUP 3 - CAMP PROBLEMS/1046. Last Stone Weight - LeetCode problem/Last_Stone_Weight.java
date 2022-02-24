class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones){
            pq.add(i);
        }
        while(pq.size() > 1){
            int left = (int)pq.poll();
            int right = (int) pq.poll();
            if (right != left) pq.add(left - right);
        }
        return (pq.size() == 0) ? 0 : pq.peek();
    }
}