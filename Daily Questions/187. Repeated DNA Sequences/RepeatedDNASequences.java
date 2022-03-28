class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() < 10) return new ArrayList<>();
        Set<String> seen = new HashSet<>();
        Set<String> ans = new HashSet<>();
        
        
        int left = 0, right = 9;
        while (right < s.length()) {
            StringBuilder sb = new StringBuilder();
            
            for(int i = left; i <= right; i++) 
                sb.append(s.charAt(i));
            
            if (seen.contains(sb.toString())) {
                ans.add(sb.toString());
            } else
                seen.add(sb.toString());
            left++;
            right++;
        }
        // System.out.println(ans);
        return new ArrayList<>(ans);
    }
}