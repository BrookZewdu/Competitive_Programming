class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.containsKey(arr[i]) ? map.get(arr[i])+1 : 1);
        }
        
        int[][] counter_array = new int[map.size()][2];
        int count = 0;
        int total = 0;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            counter_array[count][0] = entry.getKey();
            counter_array[count][1] = entry.getValue();
            total += entry.getValue();
            count++;
        }  
        
        Arrays.sort(counter_array, (a,b)-> a[1] - b[1]);
        int sum = 0;
        int j = counter_array.length - 1;
        int ans = 0;
        
        while(j > -1){
            sum += counter_array[j][1];
            ans++;
            if(total - sum <= total/2){
                break;
            }
            j--;
        }
        return ans;
    }
}