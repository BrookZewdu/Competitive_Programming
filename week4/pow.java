class Solution {
   
    public double myPow(double x, long n) {
        if(n < 0){
            x = 1/x;
            n *= -1;
        }
        
        if(n==0){
            return 1;
        }
         double y = myPow(x,n/2);
        if(n%2==0){
            return y*y;
        }else{ 
            return x*y*y;        
        }
        
    }
        
}
