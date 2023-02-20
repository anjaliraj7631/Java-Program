package RealTimeApplication;

import java.util.Scanner;

class Ola {
    String name1="Kiran";
    public void aloneBook(){
        System.out.println(name1+" your ola is booked");
    }
}
class OlaShare extends Ola {
    String name="abhi";
    public void share(){
        System.out.println(name+" your ola is booked and you have to share seat with "+name1);
    }
}
class Main{
    public static void main(String[] args) {
        OlaShare r=new OlaShare();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.No share \n2.Shared ");
        System.out.println("enter choice");
        int c=sc.nextInt();
        if(c==1){
            r.aloneBook();
        } else if (c==2) {
            r.share();
        }
        else {
            System.out.println("invalid choice");
        }
    }
}

