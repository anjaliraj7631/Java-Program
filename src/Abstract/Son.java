package Abstract;

public class Son extends Parent{
    public Son(int age){
        super(age);
    }
    @Override
    public void carrer(){
        System.out.println("I am a doctor");
    }

    @Override
    public void partner(){
        System.out.println("I love music");
    }
}
