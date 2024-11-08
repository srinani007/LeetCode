package TextProcessing;

class TireNode{
    TireNode[] children = new TireNode[26];
    boolean isEndOfWord;

    TireNode(){
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}
class Tire{
    private TireNode root;
    public Tire(){
        root = new TireNode();
    }
    public void insert(String key){
        TireNode current = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TireNode(); 
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    public boolean search(String key){
        TireNode current = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return (current != null && current.isEndOfWord);
    }

}
public class trieExample {
   public static void main(String[] args) {
    Tire tire = new Tire();
    tire.insert("apple");
    tire.insert("app");
    System.out.println("search for an app : "+ tire.search("app"));
    System.out.println("search for an apple : "+ tire.search("apple"));
    System.out.println("search for an applet : "+ tire.search("applet"));

    
   } 
}
