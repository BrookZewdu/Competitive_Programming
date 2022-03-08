class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p1 = 0, p2 = people.length - 1;
        int count = 0;
        while(p1 <= p2){
            if(people[p1] + people[p2] <= limit){
                count++;
                p1++;
                p2--;
            }else{
                count++;
                p2--;
            }
        }
        return count;
    }
}