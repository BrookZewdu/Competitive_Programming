class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int[] clo = new int[nums.length];
        
        int bool;
       List<Boolean> lst = new ArrayList<>();
        int i = 0;
        while(i < l.length){
            clo = nums;
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i]+1);
            Arrays.sort(arr);
            lst.add(checkIsAP(arr));
            i++;
        }  
        return lst;
    }
    static boolean checkIsAP(int arr[])
    {
        if (arr.length == 1){
            return true;
        } 
        int d = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++){
            if (arr[i] - arr[i-1] != d){
                return false;
            }
        }
        return true;
        }
            
    }




 