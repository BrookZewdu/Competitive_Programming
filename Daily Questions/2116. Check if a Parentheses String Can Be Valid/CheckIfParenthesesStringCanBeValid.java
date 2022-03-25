class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) return false;
        
        Stack<Integer> unlocked = new Stack<>();
        Stack<Integer> lockedOpen = new Stack<>();
        
        for (var i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') {
                unlocked.push(i);
                continue;
            }
            
            if (s.charAt(i) == '(') {
                lockedOpen.push(i);
                continue;
            }
            
            if (!lockedOpen.isEmpty()) {
                lockedOpen.pop();
                continue;
            }else if(!unlocked.isEmpty()) {
                unlocked.pop();
                continue;
            }else {
                return false;
            }
            
        }
        
        while (!lockedOpen.isEmpty()) {
            if (unlocked.isEmpty()) return false;
            if(unlocked.pop() < lockedOpen.pop()) return false;
            
        }
        
        return unlocked.size() % 2 == 0;
    }
}