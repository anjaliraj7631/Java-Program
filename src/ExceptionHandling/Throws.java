package ExceptionHandling;

public class Throws {
//    public static void m1() throws InterruptedException{
//        Thread.sleep(2000);
//    }
//    private static void m2() throws InterruptedException{
//        m1();
//    }
//    private static void m3() throws InterruptedException{
//        m2();
//    }
//
//    public static void main(String[] args) {
//        System.out.println("ps");
//        try {
//            m3();
//        }
//        catch (InterruptedException e){
//            System.out.println("Handled");
//        }
//
//        System.out.println("pe");
//    }
    public static void m1() {
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println("Handled");
        }
    }
        private static void m2() {
            m1();
        }
        private static void m3() {
            m2();
        }

        public static void main(String[] args) {
            System.out.println("ps");
           m3();

            System.out.println("pe");
        }
}
