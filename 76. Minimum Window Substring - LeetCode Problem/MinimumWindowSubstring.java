class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) 
            return "";
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        
        for(int i = 0; i < t.length(); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int min = s.length();
        int j = 0;
        String ans = "";
        // System.out.println(smap);
        // System.out.println(tmap);
        if(matches(smap, tmap)){
            ans = s.substring(0, t.length());
        }
        int i = t.length();
        while(i <= s.length()) {
            // System.out.println(s.substring(j, i) + " : " + matches(smap, tmap));
            if(matches(smap, tmap)) {
                if((i - j) <= min) {
                    ans = s.substring(j, i);
                    min = i - j;
                }
                smap.put(s.charAt(j), smap.getOrDefault(s.charAt(j), 1) - 1);
                if(smap.get(s.charAt(j)) == 0)
                    smap.remove(s.charAt(j));
                j++;
            } else if(i != s.length()){
                char ch = s.charAt(i);
                smap.put(ch, smap.getOrDefault(ch, 0) + 1);
                i++;

            } else{
                i++;
            }
        }
        // System.out.println(s.substring(j, i) + " : " + matches(smap, tmap));
//         if(matches(smap, tmap)) {

//             if((i - j + 1) <= min)
//                 ans = s.substring(j, i);
//         }
        return ans;
    }
    
    private boolean matches(Map<Character, Integer> smap, Map<Character, Integer> tmap) {
        for(char key : tmap.keySet()) {
            if((tmap.get(key) - smap.getOrDefault(key, -1)) > 0)
                return false;
        }
        return true;
            
    }
}
/*
"ADCDCBAE"
"ABC"
*/