package ExceptionHandling;

public class ExplitExceptionCreated {
    public static void main(String[] args) {
        System.out.println("Ps");
        try {
            throw new InterruptedException();
        }
        catch (InterruptedException e){
            System.out.println("Handled");
        }
        System.out.println("Pe");
    }
}
