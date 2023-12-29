package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={4,5,3,2,6,3,11,3};
        System.out.println("Before Sorting: "+Arrays.toString(a));
        bubbleSortAsc(a);
        bubbleSortDesc(a);
    }
    private static void bubbleSortAsc(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if(a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After Sorting: "+ Arrays.toString(a));
    }
    private static void bubbleSortDesc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if(a[j-1]<a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After Sorting: "+ Arrays.toString(a));
    }
}
