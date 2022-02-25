class Solution {
    public int hIndex(int[] citations) {
       int n = citations.length;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(citations[mid] > n - mid){
                right = mid - 1;
            }else if(citations[mid] < n - mid){
                left = mid + 1;
            }else{
                return n - mid;
            }
        }
        return n - left;
    }
}
/*
    //linear search for fun
        int n = citations.length;
        for(int i = 0; i < n; i++){
            if(citations[i] >= n - i){
                return n - i;
            }
        }
        return -1;        

*/