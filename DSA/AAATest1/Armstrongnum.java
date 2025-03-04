package AAATest1;

public class Armstrongnum {
    public static void main(String[] args) {
        int num = 153;
        Armstrongnum armstrong = new Armstrongnum();
        boolean result = armstrong.isArmStrong(num);
        if (result) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
    }
    public boolean isArmStrong(int num) {
        int original = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
    
}
