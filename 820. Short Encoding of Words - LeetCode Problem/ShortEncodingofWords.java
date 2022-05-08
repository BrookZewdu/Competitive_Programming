class Solution {
    TrieNode root;
    public int minimumLengthEncoding(String[] words) {
        this.root = new TrieNode();
        Map<TrieNode, Integer> map = new HashMap<>();
        int index = 0;
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            sb.reverse();
            map.put(insert(sb.toString()), index++) ;
        }
        int ans = 0;
        for(TrieNode node : map.keySet()) {
            if(node.children.isEmpty()) {
                ans += words[map.get(node)].length() + 1;
            }
        }
        return ans;
    }
    
    public TrieNode insert(String word) {
        TrieNode current = root;
        StringBuilder sb = new StringBuilder();
        for(Character ch : word.toCharArray()) {
            if(!current.children.containsKey(ch)){
                current.children.put(ch, new TrieNode());
            }
            sb.append(ch);
            current = current.children.get(ch);
            
        }
        current.isEnd = true;
        return current;
    }
    
    class TrieNode{
        boolean isEnd;
        Map<Character, TrieNode> children;
        
        public TrieNode() {
            this.children = new HashMap<>();
        }
    }
}