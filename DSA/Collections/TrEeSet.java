package Collections;

import java.util.TreeSet;

public class TrEeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(550);
        treeSet.add(105);
        treeSet.add(80);
        treeSet.add(90); 
        System.out.println(treeSet);
        treeSet.remove(550);
        System.out.println(treeSet);
        for(Integer lang : treeSet){
            System.out.println(lang);
        }
    }
}
