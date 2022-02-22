class KthLargest {
    
    int k;
     int[] nums;
     PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 //    List<Integer> list = new ArrayList<>();
     public KthLargest(int k, int[] nums) {
         this.k = k;
         this.nums = nums;
         compute();
     }
     
     public void compute(){
         int n = (k < nums.length) ? k : nums.length;
         for(int i = 0; i < n; i++){
             if(nums.length > 0)
                 minHeap.add(nums[i]);
         }
         for(int i = k; i < nums.length; i++){
             if(!minHeap.isEmpty() && nums[i] > minHeap.peek()){
                 minHeap.poll();
                 minHeap.add(nums[i]);
             }
         }
         // System.out.println(minHeap);
     }
     public int add(int val) {
         if(minHeap.size() == k && val > minHeap.peek()){
             minHeap.add(val);
             minHeap.poll();
         }else if(minHeap.size() < k){
             minHeap.add(val);
         }
         
         return (!minHeap.isEmpty()) ? minHeap.peek() : 1;
     }
 }
 
 /**
  * Your KthLargest object will be instantiated and called as such:
  * KthLargest obj = new KthLargest(k, nums);
  * int param_1 = obj.add(val);
  */
 /*
     ["KthLargest", "add", "add", "add", "add", "add"]
 [2, [-3,4,1,5,3], [3],[4],[5],[2],[-1]]
 */