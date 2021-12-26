class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < tasks.length; i++){
            map.put(tasks[i], map.containsKey(tasks[i]) ? map.get(tasks[i]) + 1 : 1);
        }
        int[] arr = new int[map.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
            arr[index] = mapEntry.getValue();
            index++;
        }
        int ans;
        Arrays.sort(arr);
        ans = arr[arr.length-1] + (arr[arr.length-1] - 1)*n;
        int temp = arr[arr.length-1];
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == temp){
                ans++;
            }
        }
        
        
        return Math.max(tasks.length, ans);
    }
}