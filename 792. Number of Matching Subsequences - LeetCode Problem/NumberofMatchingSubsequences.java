class Solution {
    TrieNode root = new TrieNode();
    HashMap<Character, List<Integer>> map;
    int ans = 0;
    public int numMatchingSubseq(String s, String[] words) {
        this.map = new HashMap<>();
        for (String word : words) {
            insert(word);
        }
        
        int index = 0;
        for(Character ch : s.toCharArray()) {
            map.putIfAbsent(ch, new ArrayList());
            map.get(ch).add(index++);
        }
        
        dfs(root, -1);
        return ans;
    }
    
    public void dfs(TrieNode node, int index) {
        int flag = -1;
        if(index != -1)
            if(!map.containsKey(node.ch)) {
                return;
            } else {
                flag = bs(node.ch, index);
                // System.out.println(flag);
                if(flag == -2)
                    return;
                else{
                    if(node.isEnd){
                        ans+= node.count;
                    }
                        
                }
            }
            for(TrieNode child : node.children) {
                if(child != null)
                    dfs(child, flag + 1);
            }
    }
    
    public int bs(Character ch , int target) {
        
        List<Integer> list = map.get(ch);
        
        int left = 0;
        int right = list.size() - 1;
        int ans  = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(list.get(mid) == target){
                return list.get(mid);
            } else if(list.get(mid) < target) {
                left = mid + 1;
                ans = left;
            } else {
                right = mid - 1;
            }
        }
        if(ans < 0) ans = 0;
        return (left >= list.size()) ? -2 : list.get(ans);
        
    }
    
    public void insert (String word) {
        TrieNode current = root;
        
        for (Character ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
            current.ch = ch;
        }
        current.isEnd = true;
        current.count++;
    }
    class TrieNode {
        boolean isEnd;
        TrieNode[] children;
        char ch;
        int count;
        public TrieNode () {
            this.children = new TrieNode[26];
            this.count = 0;
        }
    }
}