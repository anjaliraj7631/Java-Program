package NumberProgramming;

import java.util.Scanner;

public class IasExam05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age>=21 && age<=32){
            System.out.println("Eligible for exam");
        }
        else {
            System.out.println("Not eligible for exam");
        }
    }
}
