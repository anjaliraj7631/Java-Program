package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoMatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int m = sc.nextInt();
        System.out.println("Enter column number");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter value for " + (i + 1) + " row");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter row number");
        int m1 = sc.nextInt();
        System.out.println("Enter column number");
        int n1 = sc.nextInt();
        int[][] b = new int[m1][n1];
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter value for " + (i + 1) + " row");
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int[][] res = new int[a.length][a[0].length];
//        add(a, b, res);
        adddioagonal(a, b, res);
    }

    public static void add(int[][] a, int[][] b, int res[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int[] i : res) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void adddioagonal(int[][] a, int[][] b, int res[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    res[i][j] = a[i][j] + b[i][j];
                } else {
                    res[i][j] = 0;
                }
            }
        }
            for (int  k= 0; k < res.length; k++) {
                System.out.println(Arrays.toString(res[k]));
            }
    }
}
