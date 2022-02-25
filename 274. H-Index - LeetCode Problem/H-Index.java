class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
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