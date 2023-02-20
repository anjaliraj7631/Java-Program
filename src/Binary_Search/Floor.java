package Binary_Search;

public class Floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(floorNum(arr,target));
    }
    // ceiling:greatest element in array smaller or equal to target
    static int floorNum(int[] arr,int tar){
        int start=0;
        int end=arr.length-1;
        if(tar<arr[start]){
            return -1;
        }
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (tar < arr[mid]) {
                end = mid - 1;
            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
