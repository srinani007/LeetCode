package TextProcessing;

public class stringp {
   public static void main(String[] args) {
    String str = "Hello World";
    System.out.println("Length: "+str.length());
    System.out.println("Char at 3: "+str.charAt(3));
    System.out.println("Index of l: "+str.indexOf('l'));
    System.out.println("Last index of l: "+str.lastIndexOf('l'));
    System.out.println("Substring: "+str.substring(2,5));
    System.out.println("Substring: "+str.substring(2));
    System.out.println("Replace: "+str.replace('l', 'x'));
    System.out.println("Replace: "+str.replace("Hello", "Hi"));
    System.out.println("Replace: "+str.replaceAll("l", "x"));
    System.out.println("UpperCase: "+str.toUpperCase());
   } 
}
