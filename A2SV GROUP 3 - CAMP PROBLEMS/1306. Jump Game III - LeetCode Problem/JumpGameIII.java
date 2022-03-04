// time complexity -> O(n)
// space complexity -> O(n)
// where n is the size of arr

class Solution {
    HashSet<Integer> seen = new HashSet<>();
    private boolean isValid(int[] arr, int index){
        if(index >= 0 && index < arr.length) return true;
        return false;
    }
    public boolean canReach(int[] arr, int start) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        seen.add(start);
        
        while(!queue.isEmpty()){
            int curr_index = queue.poll();
            if(arr[curr_index] == 0) return true;
            int next_right = curr_index + arr[curr_index];
            int next_left = curr_index - arr[curr_index];
            if(isValid(arr, next_right) && !seen.contains(next_right)){
                queue.add(next_right);
                seen.add(next_right);
            }
            if(isValid(arr, next_left) && !seen.contains(next_left)){
                queue.add(next_left);
                seen.add(next_left);
            }
            
        }
        return false;
    }
}