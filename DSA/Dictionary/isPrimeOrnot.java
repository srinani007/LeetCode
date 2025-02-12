package Dictionary;

public class isPrimeOrnot {
    public int isPrime(int num) {
        if (num <= 1) return 0; // Not prime
        if (num <= 3) return 1; // Prime

        if (num % 2 == 0 || num % 3 == 0) return 0; // Not prime
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) return 0; // Not prime
        }
        return 1; // Prime
    }
    public static void main(String[] args) {
        isPrimeOrnot obj = new isPrimeOrnot();
        System.out.println(obj.isPrime(1)); // Output: 0
        System.out.println(obj.isPrime(2)); // Output: 1
        System.out.println(obj.isPrime(3)); // Output: 1
        System.out.println(obj.isPrime(4)); // Output: 0
        System.out.println(obj.isPrime(5)); // Output: 1
        System.out.println(obj.isPrime(6)); // Output: 0
        System.out.println(obj.isPrime(7)); // Output: 1
        System.out.println(obj.isPrime(8)); // Output: 0
        System.out.println(obj.isPrime(9)); // Output: 0
    }
}
