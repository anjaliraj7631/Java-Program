package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target");
        int n=sc.nextInt();
        int[] a={1,4,3,4,2,5};
        print(n,a);
    }

    private static void print(int n, int[] a) {
        int[][] b=new int[count(n,a)][2];
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j]==n){
                    b[temp][0]=a[i];
                    b[temp][1]=a[j];
                    temp++;
                }
            }
        }
        for (int[] s: b) {
            System.out.println(Arrays.toString(s));
        }
    }
    public static int count(int n,int[] a){
        int c=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j]==n){
                    c++;
                }
            }
        }
        return c;
    }
}
