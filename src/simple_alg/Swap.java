package simple_alg;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
     //   swap(a,b);
        fib(5);

    }
    static void swap(int a, int b){
       a=a+b;//30
        b=a-b;
        a=a-b;
       System.out.println(a+" " + b);

    }
    static void fib(int n){
        int a=0;
        int b=1;
        System.out.println(a+" "+b);
        int co=2;
       while (co<n){
          int c=b+a;
           System.out.print(" "+c);
           a=b;
           b=c;
           co++;
       }
    }
}
