package Array;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] num={2,3,5,6};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0]=66;
    }
}
