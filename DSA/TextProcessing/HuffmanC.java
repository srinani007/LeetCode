package TextProcessing;

import java.util.PriorityQueue;

class HuffmanNode implements Comparable<HuffmanNode>{
    char data;
    int frequency;
    HuffmanNode left, right;
    HuffmanNode(char data, int frequency){
        this.data=data;
        this.frequency=frequency;
        left=right=null;
    }
    @Override
    public int compareTo(HuffmanNode node){
        return this.frequency-node.frequency;
    }
}
public class HuffmanC {
   public static void printCodes(HuffmanNode root, String code){
    if (root.left == null && root.right == null) {
        System.out.println(root.data+": "+ code);
        return;
    }
    printCodes(root.left, code + "0");
    printCodes(root.right, code + "1");
   }
   public static void buildHuffmanTree(char[] charArray, int[] charFreq){
    PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
    for (int i = 0; i < charArray.length; i++) {
        queue.add(new HuffmanNode(charArray[i], charFreq[i]));
    }
    while (queue.size() > 1) {
        HuffmanNode left = queue.poll();
        HuffmanNode right = queue.poll();
        HuffmanNode newNode = new HuffmanNode('-', left.frequency + right.frequency);
        newNode.left = left;
        newNode.right = right;
        queue.add(newNode);
    }
    printCodes(queue.poll(), "");
   }
   public static void main(String[] args) {
    char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
    int[] charFreq = {5, 9, 12, 13, 16, 45};
    buildHuffmanTree(charArray, charFreq); 
   }
}
