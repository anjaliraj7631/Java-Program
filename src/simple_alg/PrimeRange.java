package simple_alg;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for (int i = a; i <b ; i++) {
            boolean res=isPrime(i);
            if(res==true){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if (n==0 || n==1){
            return false;
        } else if (n==2) {
            return true;
        }
        else {
            for (int i = 2; i <n ; i++) {
                if(n%2==0){
                    return false;
                }
            }
            return true;
        }
    }
}
