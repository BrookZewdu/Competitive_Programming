class Solution {
    public int maxResult(int[] nums, int k) {
        int[] ans = new int[nums.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a , b) -> Integer.compare(ans[b],ans[a]));
        
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = (maxHeap.isEmpty()) ? nums[i] : nums[i] + ans[maxHeap.peek()];
            
            while (!maxHeap.isEmpty() && (maxHeap.peek() - i >= k))
                maxHeap.poll();
            
            maxHeap.add(i); // 
                
        }
        // System.out.println(Arrays.toString(ans));
        return ans[0];
    }
}