class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> lst = new ArrayList<>();
        for(int i = arr.length-1; i > 0; i--){
            int largest_idx = index_finder(arr, i);
            if(largest_idx != i){
                reverse(arr, largest_idx);
                lst.add(largest_idx + 1);
                reverse(arr, i);
                lst.add(i + 1);
            }
        }
        return lst;
    }
    public static int index_finder(int[] array, int k){
        int index = k;
        for(int i = k-1; i >= 0; i--){
            if(array[i]>array[index]){
                index = i;
            }
        }
        return index;
    }
    public static void reverse(int[] array, int k){
        int i = 0; 
        int j = k;
        while(i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}