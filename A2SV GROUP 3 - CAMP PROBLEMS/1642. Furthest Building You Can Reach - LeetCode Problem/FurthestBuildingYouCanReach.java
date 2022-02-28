class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int i = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        // 4 2 7 6 9 14 12
        // 
        for(i = 0; i < heights.length - 1; i++){
            if(heights[i + 1] <= heights[i]){
                continue;
            }
            int diff = heights[i + 1] - heights[i];
            if(diff <= bricks){
                bricks -= diff;
                maxHeap.add(diff);
                
            }else{
                if(ladders > 0){
                    if(!maxHeap.isEmpty() && diff < maxHeap.peek()){
                        bricks += maxHeap.poll();
                        maxHeap.add(diff);
                        bricks -= diff;
                        ladders--;
                    }else{
                        ladders--;
                    }
                }else{
                    break;
                }
            }
            // if(ladders <= 0 && bricks <= 0) break;
            // System.out.println(minHeap);
        }
        return i;
    }
}
/*
    [200,12,700,2,5,400,8,5,10,12,7]
9
2
*/
/*
    -> 0 indexed
    -> if next buliding less than the current, can just jump off to it
    -> got bricks and ladders at your hands
    -> a ladder can get you to the next building despite the height difference
    -> you can exhuast the bricks you have
    -> the number of bricks you will lose in one jump to the next higher building is - the next building height - the current height;
    -> asked to return the index of the furthest building you can reach
*/
/*
    for the custom example: 
        [4,2,200,6,11,14,17,12]
        5
        2 
            -> the answer is 5, you can reach the 5th building (0 indexed ofcourse)
        let's solve this manually:
            so i have 5 bricks: when should I use the bricks
                when the height difference is less or equal to the bricks I have
                    but is that the only usecase??
                when should I use my ladders:
                    when the height difference is larger for me to use the bricks or when it will exhuast the number of bricks that I have
                    is that the only case??
                    
            so I start at 4, since the next is less, i can go to 2 easly
            so now I am at 2, the next is greater that I am:
                so which one should I use - bricks or ladders?
                    can I use my bricks -> 200 - 2 is 198 - cant get there using bricks so i use my ladder whick leaves me with one ladder
            now I am at 200, can go to the next one easly
            now i am at 6, to go to 11, which one should i use
                i can use both here: which one is better
                    since i can use my bricks here, lets just use them
                    now i am left with 0 bricks
            now i am 11, i have no bricks left so lets use my one ladder
            now i am at 14 - cant go any further so return index of 14
            which is 5
*/