/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1;
            if(isBadVersion(left) == true) return 1;
            int mid = n;
            int temp = 0;
            while(true){
                // mid = n / 2;
                if(isBadVersion(mid) == true){
                    temp = mid;
                    mid /= 2;
                }else{
                    break;
                }
            }
            left = mid;
            int right = temp;
            while(left <= right){
                mid = left + (right - left) / 2;
                if(isBadVersion(mid) == false){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
                if(isBadVersion(left) == true)break;
            }
            
            return left;
        }
    }