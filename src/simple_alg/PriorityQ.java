package simple_alg;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        PriorityQueue pq1=new PriorityQueue();
        pq.add(5);
        pq.add(9);
        pq.add(1);
        pq.add(11);
        pq.add(-1);
        // it will give priority to only first element
        System.out.println(pq);
        pq1.add("b");
        pq1.add("a");
        System.out.println(pq1);
    }
}
