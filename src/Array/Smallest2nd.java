package Array;

public class Smallest2nd {
    public static void main(String[] args) {
        int[] arr={4,5,55,25,6,-5,-2};
        int temp1=Integer.MAX_VALUE;
        int temp2=Integer.MAX_VALUE;
        for (int x:arr) {
            if(x<temp1) {
                temp2 = temp1;
                temp1=x;
            } else if (x<temp2) {
                temp2=x;
            }
        }
        System.out.println("1st Smallest value: "+temp1);
        System.out.println("2nd Smallest value: "+temp2);
    }
}
