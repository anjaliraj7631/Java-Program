package Recursion;

public class Varargs {
    public static void m1(int a,int... b){
        System.out.println(a);
        for (Integer i:b) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        try{
            System.out.println(10/1);
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("execute");
        }
        m1(10,20,50,40);
    }
}
