package ArrayStringJspider;

import java.util.Arrays;
import java.util.Scanner;
//codingBat
public class SortStringAsce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s=sc.nextLine();
        System.out.println("Before sorting: "+s);
        char[] c=toCharArrayMethod(s);
        sorting(c);
        String s1=new String(c);
        System.out.println("After Swapping: "+s1);
    }
    public static char[] toCharArrayMethod(String s){
        char[] c=new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            c[i]=s.charAt(i);
        }
        return c;
    }
    private static void sorting(char[] c) {
//        char[] c=s.toCharArray();
//        Arrays.sort(c);
//        System.out.println(c);
        char temp;
        for (int i=0;i<c.length;i++) {
            for (int j = i+1; j < c.length; j++) {
                if(c[i]>c[j]){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
    }
}
