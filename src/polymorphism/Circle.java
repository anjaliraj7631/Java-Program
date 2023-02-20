package polymorphism;

public class Circle extends Shapes{

    // this one is run when obj of circle is created
    // hence it override method of parent class
       @Override // this is called annotation it will check whether method is override or not
       void area(){
        System.out.println("Area of circle is pie * r * r");
    }
}
