class Solution {
    Map<Integer, Integer> map = new HashMap<>();
     public void helper(int[] nums){
         for(int i : nums){
             map.put(i, map.getOrDefault(i, 0) + 1);
         }
     }
     public int[] topKFrequent(int[] nums, int k) {
 
         helper(nums);
         PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((e1, e2) -> {
             return e2.getValue() - e1.getValue();
         });
         for(Map.Entry<Integer, Integer> e : map.entrySet()){
             pq.add(e);
         }
         int[] arr = new int[k];
         while(k > 0){
             arr[arr.length - k] = pq.poll().getKey();
             k--;
         }
         return arr;
     }
 }