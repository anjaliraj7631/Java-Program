package ProgStringArray;

import java.util.Arrays;
import java.util.Scanner;

class NthSmallestArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sorting(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter nth smallest element to find:");
        int n = sc.nextInt();
        if (n > 0 && n <= arr.length) {
            int nthSmallest = arr[n - 1];
            System.out.println("The " + n + "th smallest element is: " + nthSmallest);
        } else {
            System.out.println("Invalid input for n. Please enter a valid value.");
        }
    }

    static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}