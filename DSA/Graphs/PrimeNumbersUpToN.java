package Graphs;

import java.util.Scanner;

public class PrimeNumbersUpToN {

    static boolean isPrime(int n){
        if (n <= 1) return  false;
        if (n == 3 || n == 2) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i+=6){
            if (n % i == 0 || n % (i + 2) == 0) return false; 
        }
        return true;
    } 

    static void printPrimes(int n){
        for (int i = 2; i <= n; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + " are:");
        printPrimes(n);
        sc.close();
    }

}
            
