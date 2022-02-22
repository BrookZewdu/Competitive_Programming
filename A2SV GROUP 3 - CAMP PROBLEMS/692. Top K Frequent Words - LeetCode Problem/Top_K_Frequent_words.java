class Solution {
    Map<String, Integer> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    public void helper(String[] words){
        for(String str : words){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
    }
    public List<String> topKFrequent(String[] words, int k) {

        helper(words);
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((e1,e2) -> {
            if(e2.getValue() == e1.getValue()){
                return e1.getKey().compareTo(e2.getKey());
            }
            return e2.getValue() - e1.getValue();
        });
        for(Map.Entry<String, Integer> e : map.entrySet()){
            pq.add(e);
        }
        while(k > 0){
            System.out.print(pq.peek().getKey() + " ");
            list.add(pq.poll().getKey());
            k--;
        }

        return list;
    }
}