class Solution {
    TrieNode root;
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        this.root = new TrieNode();
        
        int numCaps = 0;
        for(Character ch : pattern.toCharArray()) {
            if(Character.isUpperCase(ch))
                numCaps++;
        }
        
        for(String query : queries) {
            insert(query);
        }
        List<Boolean> ans = new ArrayList<>();
        for(String query : queries) {
            ans.add(search(query, pattern, numCaps));
        }
        
        return ans;
    }
    
    public boolean search(String word, String pattern, int numCaps) {
        TrieNode current = root;
        int index = 0;
        int count = 0;
        for(Character ch : word.toCharArray()) {
            
            if(index < pattern.length() && pattern.charAt(index) == ch){
                index++;
            }
            current = current.children.get(ch);
            if(current.isUpper)
                count++;
        }
        
        return index == pattern.length() && count == numCaps;
    }
    public void insert(String word) {
        TrieNode current = root;
        
        for(Character ch : word.toCharArray()) {
            if(!current.children.containsKey(ch)) {
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
            current.isUpper = Character.isUpperCase(ch);
        }
        
        current.isEnd = true;
    }
    class TrieNode {
        boolean isEnd;
        boolean isUpper;
        Map<Character, TrieNode> children;
        
        public TrieNode() {
            this.children = new HashMap<>();
        }
    }
}