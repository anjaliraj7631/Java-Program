package Abstract;

public abstract class Parent {
    abstract void carrer();
    abstract void partner();

    // we cant create abstract constructor
    int age;
    public Parent(int age){
        this.age=age;
    }
    void greeting(){                      // can create normal method
        System.out.println("good morning");
    }
    static void hello(){                // can create static method
        System.out.println("Hii!");
    }
}
