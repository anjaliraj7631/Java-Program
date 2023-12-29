package Array;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5};
        int c[]=new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
            System.out.print(c[i]+",");
        }


    }
}
