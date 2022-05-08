class WordFilter {
    TrieNode pre, suf;
    public WordFilter(String[] words) {
        this.pre = new TrieNode();
        this.suf = new TrieNode();
        
        
        Set<String> seen = new HashSet<>();
        for(int i = words.length - 1; i >= 0; i--) {
            if(!seen.contains(words[i])) {
                insert(words[i], i, pre);
                StringBuilder sb = new StringBuilder(words[i]);
                sb.reverse();
                insert(sb.toString(), i, suf);
                seen.add(words[i]);
                
            }
        }
       
    }
    public void insert(String word, int index, TrieNode node) {
        TrieNode current = node;
        
        for(Character ch : word.toCharArray()) {
            if(!current.children.containsKey(ch))
                current.children.put(ch, new TrieNode());
            current = current.children.get(ch);
            current.index.add(index);
        }
        current.isEnd = true;
    }
   
    
    public int f(String prefix, String suffix) {
        TrieNode nodePre = search(prefix, pre);
        StringBuilder sb = new StringBuilder(suffix);
        sb.reverse();
        TrieNode nodeSuf = search(sb.toString(), suf);
        
        if(nodePre == null || nodeSuf == null)
            return -1;
        List<Integer> listPre = nodePre.index;
        List<Integer> listSuf = nodeSuf.index;
        Set<Integer> setPre = new HashSet<>(listPre);
        for(int i = 0; i < listSuf.size(); i++) {
            if(setPre.contains(listSuf.get(i)))
                return listSuf.get(i);
        }
        return -1;
    }
    
    public TrieNode search(String word, TrieNode root) {
        TrieNode current = root;
        
        for(Character ch : word.toCharArray()) {
            if(current.children.containsKey(ch))
                current = current.children.get(ch);
            else
                return null;
            
        }
        return current;
    }
    class TrieNode {
        boolean isEnd;
        Map<Character, TrieNode> children;
        List<Integer> index = new ArrayList<>();
        public TrieNode() {
            this.children = new HashMap<>();
        }
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */