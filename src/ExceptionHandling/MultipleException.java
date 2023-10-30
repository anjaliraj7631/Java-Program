package ExceptionHandling;

import java.io.FileNotFoundException;
//Multiple Exception Throwing To method and handled with multiple catch block in caller method
public class MultipleException {
    public static void m1(int a) throws ArithmeticException,FileNotFoundException,InterruptedException,NullPointerException{
        if(a>=0 && a<=10){
            throw new  ArithmeticException();
        } else if (a>=11 && a<=20) {
            throw new FileNotFoundException();
        } else if (a>=21 && a<=30) {
            throw new InterruptedException();
        }
        else {
            throw new NullPointerException();
        }

    }
    public static void main(String[] args) {
        System.out.println("Ps");
        try {
            m1(50);
        }
        catch (ArithmeticException e){
            System.out.println("AE Handled");
        }
        catch (FileNotFoundException e){
            System.out.println("FNFE Handled");
        }
        catch (NullPointerException e){
            System.out.println("NPE Handled");
        }
        catch (InterruptedException e){
            System.out.println("IE Handled");
        }
        System.out.println("Pe");
    }
}
