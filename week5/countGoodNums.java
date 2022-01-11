class Solution {
    public final int MOD = 1000000007;
     public long myPow(int x, long n) {
        if(n==0){
            return 1;
        }
        long y = myPow(x,n/2);
         
        if(n%2==0){
            return (y*y)%MOD;
        }else{ 
            return (x*y*y)%MOD;        
        }
        
    }
    public int countGoodNumbers(long n) {
        long num1 = myPow(5, (long)n/2 + n%2);
        long num2 = myPow(4, (long)n/2);
        long ans = 1;
        ans = (ans*num1)%MOD;
        ans = (ans*num2)%MOD;
        return (int)(ans%MOD);
    }
}
 