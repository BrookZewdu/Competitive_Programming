class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(!map.containsKey(n)){
            map.put(n, fib(n - 1) + fib(n - 2));
        }
        return map.get(n);
    }
}