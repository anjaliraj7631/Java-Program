package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Voting extends RuntimeException{
    Voting(String s){

    }
    Voting(){

    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void CheckEligibility() throws Voting{
        if(age>=18){
            System.out.println("eligible");
        }
        else {
            throw new Voting();
//            throw new Voting("Not eligible");
        }
    }
}
class VotingMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Voting v=new Voting();
        try {
            System.out.println("Enter age");
            int age = sc.nextInt();
            v.setAge(age);
            try {
                v.CheckEligibility();
            }
            catch (Voting v1){
                System.out.println("not eligible");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid value");
        }
    }
}
