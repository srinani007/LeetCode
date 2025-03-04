package AAATest1;


public class reverseString {
   public static void main(String[] args) {
    String input = "Hello, World!";
    String reversed = reverse(input);
    System.out.println("Original: " + input);
    System.out.println("Reversed: " + reversed);
    
   } 
   public static String reverse(String input){
    char[] array = input.toCharArray();
    int left = 0, right = array.length - 1;
    while(left < right){
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        left++;
        right--;
    }
    return new String(array);
   }
}
