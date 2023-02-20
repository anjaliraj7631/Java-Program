package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindMismatch {
    public static void main(String[] args) {
        int[] arr={2,1,4,2,6,5};
        System.out.println(FindMisMatch(arr));
    }
     public static List<Integer> FindMisMatch(int[] arr){
        int i=0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) { //swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
         List<Integer> ans=new ArrayList<>();
         for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index+1){
                //return new int[] {arr[index],index+1};
                ans.add(arr[index]);
                ans.add(index+1);
            }
        }
       // return new int[] {-1,-1};
         return ans;
    }
}
