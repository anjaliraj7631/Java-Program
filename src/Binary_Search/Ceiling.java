package Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(ceilingNum(arr,target));
    }
    // ceiling:smallest element in array greater or equal to target
    static int ceilingNum(int[] arr,int tar){

        int start=0;
        int end=arr.length-1;
        if (tar > arr[end]) {
            return -1;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if (tar<arr[mid]){
                end=mid-1;
            } else if (tar>arr[mid]) {
                start=mid+1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
