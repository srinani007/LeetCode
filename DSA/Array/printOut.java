package Array;

public class printOut {
    public void insert(String word) {
        for (char c : word.toCharArray()) {
            int index = c - 'a'; 
            System.out.println("Print : " + index);
        } 
    }
    public static void main(String[] args) {
        printOut obj = new printOut();
        obj.insert("prasanth");
    }
}
