package Array;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr={5,4,3,9,7};
        System.out.println("Before rotate: "+Arrays.toString(arr));
        leftRotate(arr);
    }

    private static void leftRotate(int[] arr) {
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println("After rotate: "+Arrays.toString(arr));
    }

}

