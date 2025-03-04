package AAATest1;

public class whiteRemovespaces {
   public static void main(String[] args) {
    String input = "Hello World";
    whiteRemovespaces remove = new whiteRemovespaces();
    String result = remove.removeWhitespaceString(input);
    System.out.println("Original: " + input);
    System.out.println("Without spaces: " + result);
    
   }
   public String removeWhitespaceString(String input) {
    StringBuilder result = new StringBuilder();
    for  (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) != ' ') {
            result.append(input.charAt(i));
        }
    }
    return result.toString();
   }
}
