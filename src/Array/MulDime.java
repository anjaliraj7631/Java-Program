package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MulDime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] b=new int[2][3];
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("==for each===");
//        for (int[] i:a) {
//            for (int x:i) {
//                System.out.print(x+" ");
////                System.out.println(i); give reference for every row
//            }
//            System.out.println();
//        }
//        for (int[] i:a) {
//            System.out.println(Arrays.toString(i));
//        }
//
//        System.out.println("=============");
//        for (int i = 0; i < b.length; i++) {
//            System.out.println("Enter value for "+(i+1)+" row");
//            for (int j = 0; j < b[i].length; j++) {
//                b[i][j]=sc.nextInt();
//            }
//        }
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(b[i][j]);
//            }
//            System.out.println();
//        }
        int s1=0;
        int s2=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if(i==j){
                    s1=s1+a[i][j];
                }
                if(i+j==a[i].length-1){
                    s2=s2+a[i][j];
                }
            }
        }
        System.out.println("Sum of primary diagonal: "+s1);
        System.out.println("Sum of secondary diagonal: "+s2);
    }
}
