package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedExc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter size of array");
            int n= sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter values:");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            String s="Java";
            System.out.println("Enter the index to get character from string");
            int index=sc.nextInt();
            try{
                System.out.println(s.charAt(index));
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println("Invalid index");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid output! please enter correct value");
        }
    }
}
