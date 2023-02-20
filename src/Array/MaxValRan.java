package Array;

public class MaxValRan {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 2};
        System.out.println(maxR(arr, 1, 3));
    }

        static int maxR ( int[] arr, int start, int end){
            int maxVal = arr[start];
            for (int i = start; i <= end; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
            return maxVal;
        }
    }