package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal=new Human(22,"Kunal",15000);
        Human rahul=new Human(25,"rahul",20000);
        Human ayansh=new Human(1,"Ayansh",100);

        System.out.println(Human.population);
        System.out.println(rahul.population);
        System.out.println(ayansh.population);
    }

    // this is not depend on object
   static void fun(){
        // greet(); cant use this bec it require a instances but the function we are using is not depend on instances

       // you cant access non static stuff without referencing their instances in static context
       // here, i am referencing it
        Main obj=new Main();
        obj.greet();
    }
    void fun2(){
        greet();
    }
    void greet(){
        fun();
        System.out.println("good morning");
    }


}
