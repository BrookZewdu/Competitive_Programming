class Solution {
    TrieNode root = new TrieNode();
    public boolean insert(String word) {
        TrieNode current = root;
        
        boolean flag = true;
        for (Character ch : word.toCharArray()) {
            if (!current.containsKey(ch)) {
                current.set(ch, new TrieNode());
            } 
            
            if (!current.getEnd()) {
                flag = false;
            }
            
            current = current.get(ch);
        }
        
        current.setEnd();
        return flag;
    }
    
    public String longestWord(String[] words) {
        root.setEnd();
        Arrays.sort(words);
        String ans = "";
        for (String word : words) {
            boolean flag = insert(word);
            if (flag) {
                if (word.length() > ans.length()) {
                    ans = word;
                }
            }
        }
        return ans;
    }
    
    class TrieNode {
        private boolean isEnd;
        private Map<Character, TrieNode> children;
        
        
        public TrieNode () {
            this.children = new HashMap<>();
        }
        
        public TrieNode get(char ch) {
            return children.get(ch);
        }
        
        public boolean containsKey(char ch) {
            return children.containsKey(ch);
        }
        
        public void set(char ch, TrieNode node) {
            children.put(ch, node);
        }
        
        public void setEnd() {
            isEnd = true;
        }
        public boolean getEnd() {
            return isEnd;
        }
    }
}