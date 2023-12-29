package Array;

import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] arr={2,6,4,15};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println("The largest value: "+temp);
    }
}
