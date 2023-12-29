package ThreadExam;

public class ByInherThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("Child Thread");
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException{
        ByInherThreadClass t=new ByInherThreadClass();
        t.start();
        Thread.sleep(500);
        System.out.println("Main Thread");
    }
}
