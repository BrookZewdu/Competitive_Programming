class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }else if(n < 1){
            return false;
        }else{
            return n%3==0 && isPowerOfThree(n/3);
        }
    }
}