package polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes circle=new Shapes();
        Shapes square=new Square();// which one will be access is defined by object type
        // what should be access will depend on reference type
        square.area();

    }
}
