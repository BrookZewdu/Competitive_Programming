//lets try knuth - morris - pratt algo
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())
            return -1;
        
        int arr[] = new int[needle.length()];
        int i = 0, j = 1;
        boolean beenMatching = false;
        while(j < needle.length()) {
            if(needle.charAt(i) != needle.charAt(j)) {
                if(beenMatching) {
                    i = arr[i - 1];
                    beenMatching = false;
                }else {
                    
                    j++;
                }
            } else {
                arr[j] = i + 1;
                i++;
                j++;
                beenMatching = true;
            }
        }
        
        int p1 = 0, p2 = 0;
        int diff = 0;
        loop:
        while (p2 < haystack.length()) {
            int ans = p2 - diff;
            while(p2 < haystack.length() && 
                  haystack.charAt(p2) == needle.charAt(p1)) {
                p2++;
                p1++;
                if(p1 == needle.length())
                    return ans;
            }
            if(p1 != 0){
                p1 = arr[p1 - 1];
                diff = p1;
                continue loop;
            }
            
            p2++;
        }
        return -1;
    }
}