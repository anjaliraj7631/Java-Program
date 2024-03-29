package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(FindDisappearNumber(arr));
    }

  public static List<Integer>  FindDisappearNumber(int[] arr) {
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
      for (int index = 0; index <arr.length ; index++) {
          if(arr[index] != index+1){
              ans.add(index+1);
          }
      }
      return ans;
  }
}
