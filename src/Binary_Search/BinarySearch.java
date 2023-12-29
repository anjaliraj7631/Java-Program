package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=5;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int tar){

        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (tar<arr[mid]){
                end=mid-1;
            } else if (tar>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}


