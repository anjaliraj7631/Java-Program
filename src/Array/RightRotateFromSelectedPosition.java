package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateFromSelectedPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s={"w1","w2","w3","w4","w5"};
        System.out.println(Arrays.toString(s));
        System.out.println("Enter position want to change: ");
        int p=sc.nextInt();
        rotateP(s,p);
    }

    private static void rotateP(String[] s, int p) {
        for (int i = p-2; i >=0; i--) {
            String temp=s[i];
            s[i]=s[i+1];
            s[i+1]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
