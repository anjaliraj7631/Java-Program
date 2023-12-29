package Array;

public class largest2nd {
    public static void main(String[] args) {
        int[] arr={10,20,50,12,89};
        int temp1=Integer.MIN_VALUE;
        int temp2=Integer.MIN_VALUE;
        int temp3=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
           if(arr[i]>temp1)
           {
               temp2=temp1;
               temp1=arr[i];
           }
           else if (arr[i]>temp2)
           {
               temp3=temp1;
               temp2=arr[i];
           }
           else if (arr[i]> temp3)
           {
               temp3=arr[i];
            }
        }
        System.out.println("1st Largest value: "+temp1);
        System.out.println("2nd Largest value: "+temp2);
        System.out.println("3nd Largest value: "+temp3);
    }
}
