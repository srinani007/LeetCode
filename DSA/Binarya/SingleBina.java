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
}
