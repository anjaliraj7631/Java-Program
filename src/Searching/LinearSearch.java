package Searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={4,5,2,6,3};
        int key=5;
       int index= linear(arr,key);
       if(index!=-1)
           System.out.println("Key found at "+index);
       else
           System.out.println("Key not found");
    }

    private static int linear(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
                return i;
        }
        return -1;
    }
}
