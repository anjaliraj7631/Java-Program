package LambdaFunction;

interface Operation{
    int operation(int a,int b);
}
public class Calculator {
    public static void main(String[] args) {
        Operation sum=(a,b) -> a+b;
        Operation prod=(a,b)-> a*b;
        Operation sub=(a,b)-> a-b;

        Calculator myCal=new Calculator();
        System.out.println(myCal.operate(8,6,sum));
        System.out.println(myCal.operate(25,6,sub));
        System.out.println(myCal.operate(5,6,prod));

    }
    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }
}

