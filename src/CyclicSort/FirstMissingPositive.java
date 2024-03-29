package CyclicSort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr={-1,1,2,0,5,3};
        System.out.println(FirstMissing(arr));
    }
    public static int FirstMissing(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                // swap(arr,i,correct);
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        // Search missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return index+1;
            }
        }
        //case 2 if last Number is missing
        return arr.length+1;
    }
    }

