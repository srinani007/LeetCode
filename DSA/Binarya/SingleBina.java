package Binarya;

public class SingleBina {
    public int hammingWeight(int n) {
        int sum = 0;
        String bString = Integer.toBinaryString(n);
        for (char bit : bString.toCharArray()){
            if (bit == '1'){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SingleBina singleBina = new SingleBina();
        System.out.println(singleBina.hammingWeight(00000000000000000000000000001011));
    }
}
