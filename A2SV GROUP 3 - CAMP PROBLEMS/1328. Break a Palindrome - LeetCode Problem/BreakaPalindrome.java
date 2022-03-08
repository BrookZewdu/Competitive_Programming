class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1) return "";
        StringBuilder sb = new StringBuilder(palindrome);
        for(int i = 0; i < palindrome.length(); i++){
            char temp = sb.charAt(i);
            if(sb.charAt(i) != 'a'){
                sb.setCharAt(i, 'a');
                String a = sb.toString();
                String b = sb.reverse().toString();
                if(a.equals(b)){
                    sb.reverse();
                    sb.setCharAt(i, temp);
                }else{
                    sb.reverse();
                    break;
                    
                }
                // break;
            }else if(i == palindrome.length() - 1){
                sb.setCharAt(i, 'b');
            }
        }
        String ans = sb.toString();
        return ans;
    }
}