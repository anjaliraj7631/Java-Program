package LambdaFunction;

interface Coumpute {
    int compute(int a,int b);
}
class Cal{
    public static void main(String[] args) {
        Coumpute add=(a,b) -> (a+b);
        Coumpute sub=(a,b) -> (a-b);
        Coumpute mul=(a,b) -> (a*b);
        Coumpute div=(a,b) -> (a/b);

        System.out.println("Sum: "+add.compute(10,20));
        System.out.println("Sub: "+sub.compute(10,20));
        System.out.println("Mul: "+mul.compute(10,20));
        System.out.println("Div: "+div.compute(10,20));
    }
}
