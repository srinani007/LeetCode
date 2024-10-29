package PQ;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;

class HuffmanNode implements Comparable<HuffmanNode> {
    char character;
    int frequency;
    HuffmanNode left, right;

    HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return Integer.compare(this.frequency, other.frequency);
    }
}

public class HuffmanCoding {

    public static void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.character, code);
            return;
        }
        generateCodes(root.left, code + "0", huffmanCode);
        generateCodes(root.right, code + "1", huffmanCode);
    }

    public static HuffmanNode buildHuffmanTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            priorityQueue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }
        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();

            int combinedFrequency = left.frequency + right.frequency;
            HuffmanNode parentNode = new HuffmanNode('\0', combinedFrequency);
            parentNode.left = left;
            parentNode.right = right;

            priorityQueue.add(parentNode);
        }
        return priorityQueue.poll();
    }

    public static void main(String[] args) {
        String text = "Huffman coding is a data compression algorithm";

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        HuffmanNode root = buildHuffmanTree(frequencyMap);

        Map<Character, String> huffmanCode = new HashMap<>();
        generateCodes(root, "", huffmanCode);

        System.out.println("Huffman Codes:");
        huffmanCode.forEach((k, v) -> System.out.println(k + ": " + v));

        StringBuilder encodedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encodedText.append(huffmanCode.get(ch));
        }
        System.out.println("Encoded Text: " + encodedText);

        String decodedText = decodeHuffman(encodedText.toString(), root);
        System.out.println("Decoded Text: " + decodedText);
    }

    private static String decodeHuffman(String encodedText, HuffmanNode root) {
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode currentNode = root;
        for (char bit : encodedText.toCharArray()) {
            currentNode = (bit == '0') ? currentNode.left : currentNode.right;

            if (currentNode.left == null && currentNode.right == null) {
                decodedText.append(currentNode.character);
                currentNode = root;
            }
        }
        return decodedText.toString();
    }
}
