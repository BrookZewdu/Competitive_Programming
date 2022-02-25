class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(count < k){
                    maxHeap.add(matrix[i][j]);
                }else if(maxHeap.peek() > matrix[i][j]){
                    maxHeap.poll();
                    maxHeap.add(matrix[i][j]);
                }
                count++;
            }
        }
        // int ans = -1;
        // for(int i = 0; i < k; i++){
        //     ans = maxHeap.poll();
        // }
        return maxHeap.peek();
    }
}