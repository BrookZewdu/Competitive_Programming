class Solution {
    public int largestRectangleArea(int[] heights) {
       /*
        2 1 5 6 2 3
        
       */
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int maxArea = 0;
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < n; i++){
            if(stk.isEmpty()){
                left[i] = 0;
                stk.push(i);
            }else{
                while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
                    stk.pop();
                left[i] = stk.isEmpty() ? 0 : stk.peek() + 1;
                stk.push(i);
            }
        }
        // for(int j : left){
        //     System.out.println(j);
        // }
        Stack<Integer> stk2 = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            if(stk2.isEmpty()){
                right[i] = n - 1;
                stk2.push(i);
            }else{
                while(!stk2.isEmpty() && heights[stk2.peek()] >= heights[i])
                    stk2.pop();
                right[i] = stk2.isEmpty() ? n - 1 : stk2.peek() - 1;
                stk2.push(i);
            }
        }
        // for(int j : right){
        //     System.out.println(j);
        // }
        for(int i = 0; i < n; i++){
            maxArea = Math.max(maxArea, heights[i]*(right[i] - left[i] + 1));
        }        
        return maxArea;
    }
}