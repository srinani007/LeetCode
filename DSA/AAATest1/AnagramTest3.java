package AAATest1;

import java.util.Arrays;

public class AnagramTest3 {
    public boolean isAnngaramSorted(String str1, String str2){

        //remove spaces and convert to lowercase for better comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        //check if length are different
        if (str1.length() != str2.length()) {
            return false;
        }

        //convert string to char array and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //compare sorted arrays
        return Arrays.equals(charArray1, charArray2); // return ture or flase
    }
    public static void main(String[] args) {
        AnagramTest3 aa = new AnagramTest3();
        System.out.println(aa.isAnngaramSorted("Listen", "Silent"));
    }
}
