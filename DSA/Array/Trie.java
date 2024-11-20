package Array;

class TireNode {
    TireNode[] children;
    boolean isEndOfWord;

    public TireNode() {
        children = new TireNode[26];
        isEndOfWord = false;
    }
}
public class Trie {

    private TireNode root;

    public Trie() {
        root = new TireNode();
        
    }
    
    public void insert(String word) {
        TireNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Calculate index (0 for 'a', 1 for 'b', ..., 25 for 'z')
            // Create a new TrieNode if it doesn't exist
            if( node.children[index] == null) node.children[index] = new TireNode();
            // Move to the child node
            node = node.children[index];
        }
        // Mark the end of the word
        node.isEndOfWord = true;
        
    }
    
    public boolean search(String word) {
        TireNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Calculate index (0 for 'a', 1 for 'b', ..., 25 for 'z')
            // If the child node doesn't exist, the word is not in the Trie
            if (node.children[index] == null) return false;
            // Move to the child node
            node = node.children[index];
        }
        return node.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TireNode node = root;
        for(char c : prefix.toCharArray()){
            int index = c - 'a';
            if(node.children[index] == null) return false;
            node = node.children[index];
        }
        return true;
        
    }
    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        boolean param_2 = obj.search("apple");
        boolean param_3 = obj.startsWith("app");
        System.out.println(param_2);
        System.out.println(param_3);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
