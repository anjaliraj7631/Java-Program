package simple_alg;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int empid=in.nextInt();
        String dep=in.next();

        switch (empid) {
            case 1 -> System.out.println("Anjali Raj");
            case 2 -> System.out.println("Abhay Raj");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (dep) {
                    case "CSE" -> System.out.println("CSE Department");
                    case "EC" -> System.out.println("EC Department");
                    default -> System.out.println("Invalid");
                }
            }
            default -> System.out.println("Please Enter valid empid");
        }
    }
}
