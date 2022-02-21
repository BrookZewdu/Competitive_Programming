class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        List<Integer> count = new ArrayList<Integer>();
        int j;
        for(int i = 0; i < 100; i++){
            count.add(0);
        }
        for(int i = 0; i < arr.size(); i++){
                j = count.get(arr.get(i)) + 1;
                count.set(arr.get(i), j);
                
        }
        return count;
    }

}
