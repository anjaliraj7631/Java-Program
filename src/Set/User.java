package Set;

import java.util.HashSet;
import java.util.Scanner;

public class User {
    private int id;
   private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    User(){};
    User(int id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class MainUser{
    public static void main(String[] args) {
        HashSet<User> userList=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of users :");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            User user=new User();
            System.out.println("Enter id:");
            user.setId(sc.nextInt());
            System.out.println("Enter name: ");
            user.setName(sc.next());
            System.out.println("Enter age: ");
            user.setAge(sc.nextInt());
            userList.add(user);
        }
        for (User u: userList) {
            System.out.println(u);
        }
    }
}
