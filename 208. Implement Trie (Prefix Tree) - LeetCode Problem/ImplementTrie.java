class Trie {
    class Node {
        private boolean isEnd;
        private Node[] children;
        
        public Node () {
            this.children = new Node[26];
        }
        
        public boolean containsKey(char ch) {
            return children[ch - 'a'] != null;
        } 
        
        public void setEnd() {
            isEnd = true;
        }
        
        public void put (char ch, Node node) {
            children[ch - 'a'] = node;
        }
        
        public Node get(char ch) {
            return children[ch - 'a'];
        }
        
        public boolean isEnd() {
            return isEnd;
        }
    }

    Node root;
    public Trie() {
        this.root = new Node();
    }
    
    public void insert(String word) {
        Node current = root;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!current.containsKey(ch)) {
                current.put(ch, new Node());
            }
            current = current.get(ch);  
        }
        
        current.setEnd();
    }
    
    public Node searchPrefix(String word) {
        Node current = root;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if (current.containsKey(ch)) {
                current = current.get(ch);
            } else {
                return null;
            }
            
        }
        return current;
    }
    public boolean search(String word) {
        Node node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node node = searchPrefix(prefix);
        return node != null;
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */