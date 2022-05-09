class Solution {
    TrieNode root = new TrieNode();
    public String longestCommonPrefix(String[] strs) {
        for(String word : strs) {
            insert(word);
        }
        
        return search();
    }
    public String search() {
        TrieNode current = root;
        while(!current.children.isEmpty() && current.children.size() < 2 &&
             !current.isEnd){
            current = current.children.get(current.c);
            
        }
        return current.word;
    }
    public void insert(String word) {
        TrieNode current = root;
        StringBuilder sb = new StringBuilder();
        if(word.length() < 1){
            word = " ";
        }
        for (Character ch : word.toCharArray()) {
            if (!current.children.containsKey(ch)){
                current.children.put(ch, new TrieNode());
                current.c = ch;
            }
            sb.append(ch);
            current = current.children.get(ch);
            current.word = sb.toString().trim();
        }
        
        current.isEnd = true;
    }
    class TrieNode{
        boolean isEnd;
        Map<Character, TrieNode> children = new HashMap<>();
        String word = "";
        char c;

        
    }
}