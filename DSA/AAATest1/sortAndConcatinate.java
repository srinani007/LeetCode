package AAATest1;

import java.util.Arrays;

public class sortAndConcatinate {
    public static void main(String[] args) {
        String str = "Prasanth,Anil,Ajay,Ajith";
        sortAndConcatinate sort = new sortAndConcatinate();
        String result = sort.sortAndConcatinate2(str);
        System.out.println("Sorted and concatenated string: " + result);
    }
    public String sortAndConcatinate2(String input){
        String[] parts = input.split(",");
        Arrays.sort(parts);
        return String.join("", parts);
    }
}
