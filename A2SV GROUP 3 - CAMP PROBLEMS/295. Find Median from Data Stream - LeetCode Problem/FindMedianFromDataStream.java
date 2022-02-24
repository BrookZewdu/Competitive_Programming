public class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    private double median;
    public MedianFinder() {
        minHeap =  new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        median = Integer.MIN_VALUE;
    }

    public void addNum(int num) {
//        this.list.add(num);
        if(num <= median){
            maxHeap.add(num);
        }else{  
            minHeap.add(num);
        }
        median = findMedian();
    }

    public double findMedian() {
        if(Math.abs(minHeap.size() - maxHeap.size()) > 1){
            if(minHeap.size() < maxHeap.size()){
                minHeap.add(maxHeap.poll());
            }else{
                maxHeap.add(minHeap.poll());
            }
        }
        if(minHeap.size() == maxHeap.size()){
            median = (minHeap.peek() + maxHeap.peek()) / 2.0;
            return median;
        }
        if(minHeap.size() < maxHeap.size()){
            median = maxHeap.peek();
            return median;
        }else{
            median = minHeap.peek();
            return median;
        }
    }
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */