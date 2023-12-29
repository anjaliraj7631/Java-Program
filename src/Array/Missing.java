package Array;
public class Missing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9};
        int n= arr[arr.length-1];
        int sum=(n*(n+1))/2;
        int sum2=0;
        for (int x:arr) {
            sum2+=x;
        }
        System.out.println("Missing Value: "+(sum-sum2));

        int index=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==index){
                index++;
            }
            else {
                System.out.println(index);
            }
        }
    }
}
