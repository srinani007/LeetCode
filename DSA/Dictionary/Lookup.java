package Dictionary;

public class Lookup {
    public static void main(String[] args) {
        int[] lookupTable = new int[10];
        for(int i = 0; i < lookupTable.length; i++){
            lookupTable[i] = i * i;
        }
        System.out.println(lookupTable[5]);
    }
}
