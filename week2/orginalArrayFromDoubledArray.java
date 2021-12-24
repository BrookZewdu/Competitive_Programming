class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        int[] ans = new int[changed.length/2];
        List<Integer> lst = new ArrayList<Integer>();
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for(int i = 0; i < changed.length; i++){
            int count = dict.containsKey(changed[i]) ? dict.get(changed[i]) : 0;
            dict.put(changed[i], count + 1);
        }
        
        for(int i = 0; i < changed.length; i++){
            if(dict.containsKey(changed[i]) && dict.get(changed[i]) >= 1){
                dict.put(changed[i], dict.get(changed[i])-1);
                if(dict.containsKey(changed[i]*2) && dict.get(changed[i]*2) >= 1){
                    lst.add(changed[i]);
                    dict.put(changed[i]*2, dict.get(changed[i]*2)-1);
            }
        }
        }
        if( lst.size() == ans.length && changed.length%2 == 0){
            int k = 0;
            for(int elem:lst){
                ans[k++] = elem;
            }
            // Object[] objects = lst.toArray();
            // for(int i = 0; i < lst.size(); i++){
            //     ans[i] = (int)objects[i];
            // }
            return ans;
        }else{
            return new int[0];
        }
        
}
}
/*
        1,1,2
    1,2,2,2,4,4
     1:-1,2:0,4:-1,8:-1
    
   1:0
   2:0
   4:-1
   
    
    
    
    

*/