package ThreadExam;

class OddEven {
   int count = 1;

    public void odd() {
        synchronized (this) {
            for (int i = 1; i <= 10; i += 2) {
                while (count % 2 == 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Odd: " + i);
                count++;
                this.notify();
            }
        }
    }

    public void even() {
        synchronized (this) {
            for (int i = 2; i <= 10; i += 2) {
                while (count % 2 != 0) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Even: " + i);
                count++;
                this.notify();
            }
        }
    }
}

class OddEvenMain {
    public static void main(String[] args) {
        OddEven e = new OddEven();
        Runnable r1 = () -> e.odd();
        Runnable r2 = () -> e.even();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.setPriority(10);
    }
}
