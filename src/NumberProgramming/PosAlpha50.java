package NumberProgramming;

import java.util.Scanner;

public class PosAlpha50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Al[phabet:");
        char ch1=sc.next().charAt(0);
        int pos=1;
        for (char ch='A';ch<='Z';ch++){
            if(ch==ch1){
                System.out.println(pos);
                break;
            }
            pos++;
        }
    }
}
