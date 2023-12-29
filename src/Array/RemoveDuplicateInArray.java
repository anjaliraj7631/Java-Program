package Array;

import java.util.Arrays;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] arr={1,7,4,8,2,4,1};
        System.out.println(Arrays.toString(arr));
        removeDup(arr);
    }

    private static void removeDup(int[] arr) {
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]!=-1 && arr[j]!=-1 && arr[i]==arr[j]){
                    arr[j]=-1;
                    c++;
                }
            }
        }
        int[] res=new int[arr.length-c];
        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!=-1){
                res[index++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(res));

    }
}
