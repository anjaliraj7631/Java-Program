package simple_alg;

import java.util.Scanner;
public class RecursionPrime {
    public static void main(String arg[]) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = prime(n);
            if (fact == 2)
                System.out.println(n + " prime number ");

    }
    static int fact = 0, c = 1;
    public static int prime(int num) {
            if (c <= num) {
                if (num % c == 0) {
                    fact++;
                }
                c++;
                prime(num);
            }
        return fact;
    }
}