package RealTimeApplication;


import java.util.Scanner;

public class Employee {
    String name;
    int emp_id;
    double sal;
    String dept;
    char gender;
    public void display(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter name");
//        name=sc.nextLine();
//        System.out.println("Enter emp_id");
//        emp_id=sc.nextInt();
//        System.out.println("Enter salary");
//        sal=sc.nextDouble();
//        System.out.println("Enter dept");
//        dept=sc.next();
//        System.out.println("Enter gender");
//        gender=sc.next().charAt(0);

        System.out.println("Name: "+name);
        System.out.println("Emp_id: "+emp_id);
        System.out.println("Salary: "+sal);
        System.out.println("Department: "+dept);
        System.out.println("Gender: "+gender);
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        System.out.println();
        System.out.println("1st Employee Details:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        e1.name=sc.nextLine();
        System.out.println("Enter emp_id");
        e2.emp_id=sc.nextInt();
        System.out.println("Enter salary");
        e1.sal=sc.nextDouble();
        System.out.println("Enter dept");
        e1.dept=sc.next();
        System.out.println("Enter gender");
        e1.gender=sc.next().charAt(0);
//        e1.display();
        System.out.println();
        System.out.println("2nd Employee Details:");
        System.out.println("Enter name");
        e2.name=sc.next();
        System.out.println("Enter emp_id");
        e2.emp_id=sc.nextInt();
        System.out.println("Enter salary");
        e2.sal=sc.nextDouble();
        System.out.println("Enter dept");
        e2.dept=sc.next();
        System.out.println("Enter gender");
        e2.gender=sc.next().charAt(0);

        System.out.println();
        System.out.println("3rd Employee Details:");
        System.out.println("Enter name");
        e3.name=sc.next();
        System.out.println("Enter emp_id");
        e3.emp_id=sc.nextInt();
        System.out.println("Enter salary");
        e3.sal=sc.nextDouble();
        System.out.println("Enter dept");
        e3.dept=sc.next();
        System.out.println("Enter gender");
        e3.gender=sc.next().charAt(0);
//        e3.name="Jaya";
//        e3.emp_id=3;
//        e3.sal=30000;
//        e3.dept="Sales";
//        e3.gender="Female";
        e1.display();
        e2.display();
        e3.display();

        System.out.println("Weather u want to change dept? ");
        System.out.println("Enter Y or N");
        String choice=sc.next();
        if (choice.equals("Y")){
            System.out.println("Employee1/n Employee2/n Employee3");
            System.out.println("Enter the choice");
            int ch= sc.nextInt();
            switch (ch){
                case 1: {
                    System.out.println("Enter the new dept");
                    String new_dept = sc.next();
                    e1.dept = new_dept;
                }break;
                case 2: {
                    System.out.println("Enter the new dept");
                    String new_dept = sc.next();
                    e2.dept = new_dept;
                }break;
                case 3: {
                    System.out.println("Enter the new dept");
                    String new_dept = sc.next();
                    e3.dept = new_dept;
                }break;
                default:
                    System.out.println("Invalid choice");
            }
            e1.display();
            e2.display();
            e3.display();
        }
        else {
            System.out.println("Thank you");
        }


    }
}
