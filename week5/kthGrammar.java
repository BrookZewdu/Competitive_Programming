class Solution {
    public int kthGrammar(int n, int k) {
        // int temp = kthGrammar(n--,k/2 + k%2);
        if(k == 1 || n == 1){
            return 0;
        }
        int temp = kthGrammar(n--,k/2 + k%2);
        if(temp == 0 && k % 2 != 0){
            return 0;
        }else if(temp == 0 && k % 2 == 0){
            return 1;
        } 
            
        if(temp == 1 && k % 2 == 0){
            return 0;
        }else {
            return 1;
        }
  
      
    }
}