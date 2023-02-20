package oops;

public class thisk {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student kunal=new Student(15,"Kunal Ku",95.2f);
        Student rahul=new Student(18,"rahul");

    //    kunal.rno=12;
      //  kunal.name="Kunal K";
   //     kunal.marks=88.07f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        kunal.changeName("Shoe Lovers");
        kunal.greeting();
        Student random=new Student();
        System.out.println(random.name);
    }
}
    // create a class
   class  Student{
        int rno;
        String name;
        float marks=90;

        void greeting(){
            System.out.println("Hello! my name is "+ this.name);
        }
        void changeName(String newName){
            name=newName;
        }
        // we need a way to add value to above properties object by object
        //we need one word to access the every object

        Student(int rno,String name){
            this.rno=rno;
            this.name=name;
        }

        Student(){
            //this is how to call constructor from another constructor
            this(13,"default",69.0f);
        }
        //Student arpit=new Student(18,"arpit",52.25);
        //here this keyword will be replaced with arpit
        Student(int roll,String name,float marks){
            rno=roll;// if we are using same variable name we have to use this keyword
            this.name=name;
            this.marks=marks;
        }
    }

