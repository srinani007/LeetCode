package Dictionary;

import java.util.Random;

class SkipListNode{
    int value;
    SkipListNode[] forward; // Array of forward pointers for different levels
    public SkipListNode(int value, int level) {
        this.value = value;
        this.forward = new SkipListNode[level + 1];
    }
}
public class SkipList {
    private static final int MAX_LEVEL = 16; // Maximum level for nodes
    private static final double PROBABILITY = 0.5; // Probability factor for level increment
    private SkipListNode header; // Header node (acts as a sentinel)
    private int currentLevel; // Current maximum level in the list
    private Random random; // Random generator for level selection
    public SkipList() {
        this.currentLevel = 0;
        this.random = new Random();
        this.header = new SkipListNode(Integer.MAX_VALUE, MAX_LEVEL);
    }
    // Generate random level for new node based on probability
    private int randomLevel() {
        int level = 0;
        while (random.nextDouble() < PROBABILITY && level < MAX_LEVEL) {
            level++;
        }
        return level;
    }
    // Insert a value into the skip list  
    public void insert(int value) {
        SkipListNode[] update = new SkipListNode[MAX_LEVEL +1];
        SkipListNode current = header;
        // Find the position to insert the new value
        for (int i = currentLevel; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value < value) {
                current = current.forward[i];
            }
            update[i] = current;
        }

        current = current.forward[0];
        // Insert only if value is not already present
        if (current == null || current.value != value) {
            int newLevel = randomLevel();
            // If new level is greater, update header references and increase list level
            if (newLevel > currentLevel) {
                for (int i = currentLevel + 1; i <= newLevel; i++) {
                    update[i] = header;
                }
                currentLevel = newLevel; 
            }
            // Insert the new node with its level
            SkipListNode newNode = new SkipListNode(value, newLevel);
            for (int i = 0; i <= newLevel; i++) {
                newNode.forward[i] = update[i].forward[i];
                update[i].forward[i] = newNode;
            }   
        }
    }
    // Search for a value in the skip list
    public boolean search(int value) {
        SkipListNode current = header;
        // Move through levels to find the closest valu
        for (int i = currentLevel; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value < value) {
                current = current.forward[i];
            }
        }
        current = current.forward[0];
        return current != null && current.value == value;
    }
    // Delete a value from the skip list
    public void delete(int value) {
        SkipListNode[] update = new SkipListNode[MAX_LEVEL + 1];
        SkipListNode current = header;
        // Locate nodes that need updating
        for (int i = currentLevel; i >= 0; i--) {
            while (current.forward[i] != null && current.forward[i].value < value) {
                current = current.forward[i];
            }
            update[i] = current;
        }
        current = current.forward[0];
        // Delete if found
        if (current != null && current.value == value) {
            for (int i = 0; i <= currentLevel; i++) {
                if (update[i].forward[i] != current) break;
                update[i].forward[i] = current.forward[i];
            }
            // Adjust level if topmost levels are empty
            while (currentLevel > 0 && header.forward[currentLevel] == null) {
                currentLevel--;
            }
        }
    }
    // Print the skip list for visual debugging
    public void printList() {
        for (int i = 0; i <= currentLevel; i++) {
            SkipListNode node = header.forward[i];
            System.out.println("Level " + i +": ");
            while (node != null) {
                System.out.print(node.value + " ");
                node = node.forward[i];;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SkipList skipList = new SkipList();

        // Test insertions
        skipList.insert(3);
        skipList.insert(5);
        skipList.insert(7);
        skipList.insert(9);
        skipList.insert(12);
        skipList.insert(19);

        // Print the list
        System.out.println("Skip list after insertions:");
        skipList.printList();

        // Search tests
        System.out.println("Search for 5: " + skipList.search(5));
        System.out.println("Search for 9: " + skipList.search(9));

        // Test deletions
        skipList.delete(3);
        skipList.delete(12);

        // Print list after deletions
        System.out.println("Skip list after deletions:");
        skipList.printList();
    }
}
