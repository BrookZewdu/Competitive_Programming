import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer,Integer> dict = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count = dict.containsKey(nums[i]) ? dict.get(nums[i]) : 0;
            dict.put(nums[i], count + 1);
        }
        List<Integer> mapKeys = new ArrayList<>(dict.keySet());
        List<Integer> mapValues = new ArrayList<>(dict.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

    LinkedHashMap<Integer, Integer> sortedMap =
        new LinkedHashMap<>();

    Iterator<Integer> valueIt = mapValues.iterator();
    while (valueIt.hasNext()) {
        Integer val = valueIt.next();
        Iterator<Integer> keyIt = mapKeys.iterator();

        while (keyIt.hasNext()) {
            Integer key = keyIt.next();
            Integer comp1 = dict.get(key);
            Integer comp2 = val;

            if (comp1 == comp2) {
                keyIt.remove();
                sortedMap.put(key, val);
                break;
            }
        }
    }
        
        Object[] a = sortedMap.keySet().toArray();
        int[] b = new int[k];
        for(int i = 0; i < k; i++){
            b[i] = (int)a[a.length-1-i];
        }
        return b;
    }
}