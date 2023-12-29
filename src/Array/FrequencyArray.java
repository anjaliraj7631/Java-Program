package Array;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr={1,4,1,5,2,4,1,6,7,5,7,6};
        countFrequency(arr);
    }
    public static void countFrequency(int[] arr){
        int[] freq=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freq[i]=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i]!=-1 && arr[j]!=-1) {
                    freq[i]++;
                    arr[j] =-1;
                }
            }
            if (arr[i]!=-1 ){
                System.out.println(arr[i]+"---->"+freq[i]);
            }
        }
    }
}
