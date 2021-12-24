class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stk = new Stack<Double>();
        double[][] lst = new double[position.length][2];
        for(int i = 0; i < position.length; i++){
            lst[i][0] = (double)position[i];
            lst[i][1] = (target - position[i]) / (double)speed[i];
        }
        Arrays.sort(lst, (a, b) -> Double.compare(b[0], a[0]));
        int counter = 1;
        stk.push(lst[0][1]);
        for(int i = 0; i < lst.length; i++){
            while(!stk.isEmpty() && lst[i][1] > stk.peek()){
                stk.push(lst[i][1]);
            }
            
            
        }
        return stk.size();
    }
}