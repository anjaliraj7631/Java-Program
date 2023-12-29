package Recursion;

public class PrimeNum {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        int fact = 0;
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                fact++;
            }
        }
        if (fact == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void prime(int n, int m) {
        if (n == m+1) {
            return;
        }
        if (isPrime(n)) {
            System.out.println(n);
        }
        prime(n + 1, m);
    }

    public static void main(String[] args) {
        prime(2, 10);
    }
}
