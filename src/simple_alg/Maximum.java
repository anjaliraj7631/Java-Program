package simple_alg;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
//        int max = a;
//        if(b > max){
//          max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);

        int maxi= Math.max(c,Math.max(a,b));
        System.out.println(maxi);
    }
}
