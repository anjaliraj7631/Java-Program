package InheritanceExam;

public class main {
    public static void main(String[] args) {
        Box box=new Box();
        System.out.println(box.l+" "+box.w+" "+box.h);
        Box cube =new Box(5);
        //Box box2=new Box(box);
        System.out.println(cube.l+" "+cube.w+" "+cube.h);

        BoxWeight box3=new BoxWeight();
        BoxWeight box4=new BoxWeight(2,3,4,5);
        System.out.println(box4.weight+" "+box4.h);


        Box b4=new BoxWeight(2,3,5,8);
        // u are not able to access weight variable czz refernce

        BoxPrice b=new BoxPrice(5,6,5,5,45);
        System.out.println(b.cost);




    }
}
