package ThreadExam;

import java.util.LinkedList;
import java.util.Scanner;

public class Product {
    LinkedList<Integer> bufferShared = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    int c = 0;

    synchronized public void produce() {
        while (c < 3) {
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            bufferShared.add(data);
            c++;
        }
        this.notify();
    }

    synchronized public void consume() {
        while (bufferShared.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (!bufferShared.isEmpty()){
            System.out.println("Consumed: " + bufferShared.remove() + ". Current buffer shared: " + bufferShared);
        }
    }
}

class MainProduct {
    public static void main(String[] args) {
        Product p = new Product();
        Runnable r1 = () -> p.produce();
        Runnable r2 = () -> p.consume();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.setPriority(10);
    }
}
