
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
      //comparator
        Arrays.sort(nums, (a,b) -> {
            if (a.length() == b.length()) {
                return b.compareTo(a);
            }
            return b.length() - a.length();
        });
        return nums[k - 1];
    }
    
}
