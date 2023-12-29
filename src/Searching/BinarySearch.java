package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8};
        int key=3;
        int index= binary(arr,key);
        if(index!=-1)
            System.out.println("Key found at "+ index);
        else
            System.out.println("Key not found");
    }

     static int binary(int[] arr, int key) {
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(key<arr[mid]){
                e=mid-1;
            } else if (key>arr[mid]) {
               s=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
