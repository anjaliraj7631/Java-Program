package Array;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] a={4,5,7,3,9};
        System.out.println("Original Array"+Arrays.toString(a));
        rightRotate(a);
    }

    private static void rightRotate(int[] a) {
        int temp=a[a.length-1];
        for (int i = a.length-2; i >=0; i--) {
            a[i+1]=a[i];
        }
        a[0]=temp;
        System.out.println("After rotate: "+Arrays.toString(a));
    }
}
