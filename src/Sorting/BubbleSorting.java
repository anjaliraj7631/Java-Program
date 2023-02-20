package Sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr={5,4,-1,9,-32,3,8,0};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        boolean swapped;
        //run step n-1 time
        for (int i=0;i< arr.length;i++){
            swapped=false;
            //for each step ,max item will come at last respective index
            for (int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap if item is smaller than previous item
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // if u didn't swap for particular value of i, it means array is sorted , hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
