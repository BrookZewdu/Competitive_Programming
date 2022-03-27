class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max_repeat = 0, len = 1;
        
        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            max_repeat = Math.max(max_repeat, map.get(s.charAt(right)));
            
            if (right - left + 1 - max_repeat > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            len = Math.max(len, right - left + 1);
            right++;
        }
        // System.out.println(count);
        return len;
    }
}
/*
    ABAB
     
*/