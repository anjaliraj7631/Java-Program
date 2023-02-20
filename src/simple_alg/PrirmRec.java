package simple_alg;

import java.util.Scanner;

public class PrirmRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int count = 1;
        int a = 1;
        int f = 0;
        fact(n, count, f, a);
        if (f == 2) {
            System.out.println(f);
            System.out.println(n + "prime");
        } else {
            System.out.println(n + "not prime");
        }
    }

    private static int fact(int n, int count, int f, int a) {
        if (a <= n) {
            if (n % count == 0) {
                f++;
                System.out.println(f);
            }
            count++;
            System.out.println(count);
            if (count <= n) {
                fact(n, count, f, a);
            }
        }

        return f;
    }
}
