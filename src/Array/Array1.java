package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] a=new int[3];
        int[] a={2,3,5};
        int c=0;
        System.out.println("Enter Value: ");

       int[] arr= ArrayCall();
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
        for (int j:arr) {
            System.out.println(j);
        }
//        for (int i = 0; i < a.length; i++) {
//            a[i]=sc.nextInt();
//        }
//        System.out.print("[");
//        for (int j = 0; j < a.length; j++) {
//            System.out.print((a[j]));
//            if(j<a.length-1)
//            System.out.print(",");
//        }
//        System.out.print("]");
//        System.out.println(Arrays.toString(a));
//        int[] b=new int[a.length];
//        for (int i:a) {
//            a[c]= sc.nextInt();
//            c++;
//        }
//        System.out.println(Arrays.toString(a));

    }

    private static int[] ArrayCall() {
        int[] b={2,3,5,7};
        return b;
    }

//    private static void ArrayCall(int[] a) {
//        System.out.println(Arrays.toString(a));
//    }


}
