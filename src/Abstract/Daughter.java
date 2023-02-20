package Abstract;

public class Daughter extends Parent{
    Daughter(int age){
        super(age);
    }

    @Override
    public void carrer(){
        System.out.println("I am a coder");
    }
    @Override
    public void partner(){
        System.out.println("i love drdz");
    }
}
