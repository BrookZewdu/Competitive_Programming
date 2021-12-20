class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(nums2[0]);
        map.put(nums2[0], -1);
            for(int i = 1; i < nums2.length; i++){
                map.put(nums2[i], -1);
                
                while((!stk.isEmpty()) && (stk.peek() < nums2[i])){
                    map.put(stk.pop(), nums2[i]);    
                }
                    stk.push(nums2[i]);
            }
        // System.out.println(map.keySet());
        for(int j = 0; j < nums1.length; j++){
            if(!map.isEmpty() && map.containsKey(nums1[j])){
                nums1[j] = map.get(nums1[j]);
            }
            
        }
            return nums1;
    }
}


 /*
    so first, I will create a stack. push the first elemnt of nums2 into it. implement monotonic stack, create a map to remenber who pushed who
 
 
 */