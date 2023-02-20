package simple_alg;

import java.util.Scanner;

public class Switch_Fruits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        if ("Mango".equals(fruit)) {
            System.out.println("King of fruits");
        } else if ("Apple".equals(fruit)) {
            System.out.println("A sweet red fruit");
        } else if ("Orange".equals(fruit)) {
            System.out.println("Round fruit");
        } else if ("Grapes".equals(fruit)) {
            System.out.println("small fruits");
        } else {
            System.out.println("Please enter valid fruit");
        }
    }
}
