class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stk = new Stack<Integer>();
        int[] arr = new int[temperatures.length];
        int index;
        for(int i = 0; i < temperatures.length; i++){
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                index = stk.pop();
                arr[index] = i - index;
            }
            stk.push(i);
        }
        return arr;
    }
}

/*
   
    




    |                    |  
    |                    |   
    |                   |
    |                   |
    |                   |
    |                   |
    |                 |
    |________72___________|



*/
