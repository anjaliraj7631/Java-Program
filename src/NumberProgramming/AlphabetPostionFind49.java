package NumberProgramming;

import java.util.Scanner;

public class AlphabetPostionFind49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Position:");
        int pos=sc.nextInt();
        char ch='A';
        for (int i = 1; i <=26; i++) {
            if(pos==i){
                System.out.println(ch);
            }
            ch++;
        }
    }
}
