class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        if (security.length == 1) 
            return (time == 0) ? new ArrayList<>(Arrays.asList(0)) : 
                                new ArrayList<>();
        int[] before = new int[security.length];
        
        for (int i = 1; i < before.length; i++) 
            if (security[i - 1] >= security[i]) 
                before[i] = before[i - 1] + 1;
        
        
        int [] after = new int[security.length];
        for (int i = after.length - 2; i >= 0; i--) 
            if (security[i + 1] >= security[i]) 
                after[i] = after[i + 1] + 1;
        
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < before.length; i++) 
            if (before[i] >= time && after[i] >= time) 
                result.add(i);
            
        return result;
    }
}