package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.contains(30));
        list.remove(2);
        System.out.println(list);

        Scanner in=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>(5);
        for (int i=0;i<5;i++){
            li.add(in.nextInt());
        }
        for (int i=0;i<5;i++){
            System.out.println(li.get(i));
        }
    }
}
