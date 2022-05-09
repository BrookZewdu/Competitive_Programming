class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        int j = 0;
        StringBuilder sb = new StringBuilder();
        Set<Character> used = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                if(used.contains(t.charAt(j)))
                   return false;
                map.put(s.charAt(i), t.charAt(j));
                sb.append(t.charAt(j));
                used.add(t.charAt(j));
            } else {
                
                sb.append(map.get(s.charAt(i)));
            }
            j++;
        }
        return sb.toString().equals(t);
    }
}