class Solution {
    TrieNode root = new TrieNode();
    List<List<String>> ans;
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        this.ans = new ArrayList<>();
        for (String word : products) {
            insert(word);
        }
            
        TrieNode current = root;
        boolean flag = true;
        
        for(Character ch : searchWord.toCharArray()) {
            int index = ch - 'a';
            if(current.children[index] != null) {
                current = current.children[index];
            } else{
                flag = false;
            }
            
            List<String> temp = new ArrayList<>();
            if(flag)dfs(current, temp);
           
            List<String> list = new ArrayList<>();
            
            for(int i = 0; i < Math.min(3, temp.size()); i++) {
                list.add(temp.get(i));
            }
            ans.add(list);
        }
        return ans;
    }
    
    public void insert(String word) {
        TrieNode current = root;
        StringBuilder sb = new StringBuilder();
        for (Character ch : word.toCharArray()) {
            sb.append(ch);
            int index = ch - 'a';
            if (current.children[index] == null) 
                current.children[index] = new TrieNode();
            
            current = current.children[index];
        }
        current.isEnd = true;
        current.word = sb.toString();
    }
    
    
    public void dfs(TrieNode node, List<String> list) {
        if(node.isEnd){
            list.add(node.word);
        }
     
        for (TrieNode curr : node.children) {
            if(curr == null) continue;
            dfs(curr, list);
        }
        
    }
    class TrieNode {
        boolean isEnd;
        // Map<Character, TrieNode> children;
        TrieNode[] children;
        String word;
        
        public TrieNode() {
            this.children = new TrieNode[26];
        }
    }
}