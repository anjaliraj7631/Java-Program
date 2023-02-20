package simple_alg;

import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter ur name:");
        String message = in.next();
        String personalised=greet(message);
        System.out.println(personalised);
    }
    static String greet(String name){
        String greeting="How are you " + name;
        return greeting;
    }
}
