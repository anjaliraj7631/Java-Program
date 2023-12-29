package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a={4,5,2,9,7};
        System.out.println("Before Sorting: "+ Arrays.toString(a));
        divide(a,0,a.length-1);
        System.out.println("After Sorting: "+ Arrays.toString(a));
    }
    public static void divide(int[] a,int si,int ei){
        if(si>=ei)
            return;
        int mid=si+(ei-si)/2;
        divide(a,si,mid);//left side array
        divide(a,mid+1,ei);//right side array
        merge(a,si,mid,ei);
    }
    public static void merge(int[] a,int si,int mid,int ei){
        int[] merge=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int x=0;
        while (index1<=mid && index2<=ei){
            if(a[index1] < a[index2]){
                merge[x]=a[index1];
                x++;
                index1++;
            }else {
                merge[x++]=a[index2++];
            }
        }
        //add the remaning element if one array is completed and other array have still remaning element
        while (index1<=mid){
            merge[x++]=a[index1++];
        }
        while (index2<=ei){
            merge[x++]=a[index2++];
        }
        for (int i = 0,j=si; i < merge.length; i++,j++) {
            a[j]=merge[i];
        }
    }
}
