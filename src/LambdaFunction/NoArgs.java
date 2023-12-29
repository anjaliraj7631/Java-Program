package LambdaFunction;

interface Demo{
    void m1();
}
public class NoArgs {
    public static void main(String[] args) {
        Demo d=()->{System.out.println("Hello");};
        d.m1();
    }
}
