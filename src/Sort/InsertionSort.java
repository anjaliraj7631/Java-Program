package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={4,5,3,2,6,3,11};
        System.out.println("Before Sorting: "+ Arrays.toString(a));
        insertionSortAsc(a);
    }

    public static void insertionSortAsc(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int current_element=a[i];//5
            int j=i-1;//0
            while (j>=0 && current_element<a[j]){//5<4
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current_element;
        }
        System.out.println("After sorting: "+Arrays.toString(a));
    }
}
