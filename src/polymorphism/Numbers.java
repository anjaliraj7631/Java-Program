package polymorphism;

public class Numbers {
    double sum(double a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers s1=new Numbers();
        System.out.println(s1.sum(4,4));// hre it will check the method during compile time which would execute
        System.out.println(s1.sum(8,5,5));
    }
}
