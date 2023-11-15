package ProgStringArray;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row: ");
        int r=sc.nextInt();
        int a=1;
        int star=1;
        int space=(r-1)/2;
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*"+" ");
//                System.out.print(a++ + " ");
//                if (a==2)
//                    a=0;
            }
            System.out.println();
            if (i < (r + 1) / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star-= 2;
            }
        }
    }
}
