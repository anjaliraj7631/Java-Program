package CyclicSort;

import java.util.Arrays;

public class MissingValue {
    public static void main(String[] args) {
        //int[] arr={4,0,2,1};
        int[] arr={3,0,2,1};
        System.out.println(MissingNumber(arr));
    }
   public static int MissingNumber(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
               // swap(arr,i,correct);
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        // Search missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        //case 2 if last Number is missing
        return arr.length;
    }
}
