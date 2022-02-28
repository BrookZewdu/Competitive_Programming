class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long left = 1;
        long right = (long)totalTrips*time[0];
        long ans = -1;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long sum = total(time, mid);
            // System.out.println(sum);
            if(sum < totalTrips){
                left = mid + 1;
            }else if(sum >= totalTrips){
                ans = mid;
                right = mid - 1;
            }
        }
       return (ans == -1) ? totalTrips*time[0] : ans; 
    }
    public long total(int[] time, long t){
        long sum = 0;
        for(int i = 0; i < time.length; i++){
            sum += t / (long)time[i];
        }
        return sum;
    }
}
