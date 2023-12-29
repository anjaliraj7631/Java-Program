package ThreadExam;
public class ByRunnableInterface {
    public static void main(String[] args) {
        Runnable r=()-> {
            for (int i = 0; i <=5; i++) {
                System.out.print(i);
            }
        };
        Thread t=new Thread(r);
        Thread t1=new Thread(r);
        t.start();
        t.setPriority(1);
        Thread.currentThread().setPriority(10);
        for (char i = 'a'; i <='e'; i++) {
            System.out.print(i);
        }
    }
}
