package CyclicSort;

import java.util.*;

public class FindAllDuplicateNumber {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(FindDuplicate(arr));
    }

    public static List<Integer> FindDuplicate(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index]!= index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
}
