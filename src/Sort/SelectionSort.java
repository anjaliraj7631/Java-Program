package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={4,5,2,6,3,11};
        System.out.println("Before Sorting: "+ Arrays.toString(a));
        slectionSortAsc(a);
        slectionSortDesc(a);
    }

    private static void slectionSortAsc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int smallest_index=i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[smallest_index]>a[j]) {
                    smallest_index = j;
                }
            }
            int temp=a[i];
            a[i]=a[smallest_index];
            a[smallest_index]=temp;
        }
        System.out.println("After Sorting: "+Arrays.toString(a));
    }
    private static void slectionSortDesc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int smallest_index=i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[smallest_index]<a[j]) {
                    smallest_index = j;
                }
            }
            int temp=a[i];
            a[i]=a[smallest_index];
            a[smallest_index]=temp;
        }
        System.out.println("After Sorting: "+Arrays.toString(a));
    }
}
